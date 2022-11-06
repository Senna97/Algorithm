package step04;

import java.util.Scanner;

public class No4344 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        for (int i = 0; i < C; i++) {
            int N = sc.nextInt();
            int[] nums = new int[N];
            for (int j = 0; j < N; j++) {
                nums[j] = sc.nextInt();
            }

            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            float average = (float) sum / N;

            int count = 0;
            for (int num : nums) {
                if (num > average) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n", (float) count * 100 / N);
        }
    }
}
