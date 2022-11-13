package step06;

import java.util.Scanner;

public class No2675 {

    public void repeat(int R, String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < R; j++) {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        No2675 no2675 = new No2675();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int R = sc.nextInt();
            String str = sc.next();

            no2675.repeat(R, str);
        }
    }
}
