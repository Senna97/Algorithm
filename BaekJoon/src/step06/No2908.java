package step06;

import java.util.Scanner;

public class No2908 {

    public int reverse(int num) {
        String str = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return Integer.parseInt(String.valueOf(sb));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        No2908 no2908 = new No2908();
        int newNum1 = no2908.reverse(num1);
        int newNum2 = no2908.reverse(num2);

        int max = Math.max(newNum1, newNum2);
        System.out.println(max);
    }
}
