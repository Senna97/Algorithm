package step04;

import java.util.Scanner;

public class No10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int find = sc.nextInt();

        int count = 0;
        for (int num : nums) {
            if (num == find) {
                count++;
            }
        }
        System.out.println(count);
    }
}
