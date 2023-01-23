package novice.high.ch02.iterator;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class GoldenRatioToast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 처음 식빵의 개수
        int m = sc.nextInt(); // 레시피 암호문의 개수

        String toastState = sc.next(); // 식빵들의 상태

        LinkedList<Character> toast = new LinkedList<>();
        for (int i = 0; i < toastState.length(); i++) {
            toast.add(toastState.charAt(i));
        }

        ListIterator<Character> it = toast.listIterator(toast.size());

        for (int i = 0; i < m; i++) {
            char command = sc.next().charAt(0);

            if (command == 'L') {
                if (it.hasPrevious()) {
                    it.previous();
                }
            } else if (command == 'R') {
                if (it.hasNext()) {
                    it.next();
                }
            } else if (command == 'D') {
                if (it.hasNext()) {
                    it.next();
                    it.remove();
                }
            } else if (command == 'P') {
                char ch = sc.next().charAt(0);
                it.add(ch);
            }
        }

        it = toast.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
    }
}
