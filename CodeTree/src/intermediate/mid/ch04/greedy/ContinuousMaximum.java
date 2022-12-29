package intermediate.mid.ch04.greedy;

import java.util.Scanner;

public class ContinuousMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = 0;
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            answer = Math.max(sum, answer);
        }
        System.out.println(answer);
    }
}