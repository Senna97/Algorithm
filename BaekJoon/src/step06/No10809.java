package step06;

import java.util.Scanner;

public class No10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.printf("%d ", str.indexOf(i));
        }
    }
}