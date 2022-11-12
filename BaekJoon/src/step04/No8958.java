package step04;

import java.util.Scanner;

public class No8958 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        for (int i = 0; i < C; i++) {
            String str = sc.next();
            int[] scores = new int[str.length()];
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    count++;
                    scores[j] = count;
                } else {
                    count = 0;
                }
            }

            int sum = 0;
            for (int score : scores) {
                sum += score;
            }
            System.out.println(sum);
        }
    }
}