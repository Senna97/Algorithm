package step06;

import java.util.Scanner;

public class No11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String nums = sc.next();

        int sum = 0;
        for (int i = 0; i < nums.length(); i++) {
            sum += Integer.parseInt(String.valueOf(nums.charAt(i)));
        }
        System.out.println(sum);
    }
}
