package step04;

import java.util.Arrays;
import java.util.Scanner;

public class No8958 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        String[] quiz = new String[c];
        int score = 0;

        for (int i = 0; i < quiz.length; i++) {
            quiz[i] = sc.next();
        }

        System.out.println(Arrays.toString(quiz));

        for (String q : quiz) {
            for (int i = 0; i < q.length(); i++) {
                if (q.charAt(i) == 'O' && q.charAt(i) == q.charAt(i + 1)) {
                    score = score + 1;
                }
            }
        }
    }
}