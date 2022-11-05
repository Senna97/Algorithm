package step04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class No5597 {
    public static void main(String[] args) {
        boolean[] flag = new boolean[30];
        Arrays.fill(flag, true);

        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 28; i++) {
            nums.add(sc.nextInt());
        }

        for (Integer num : nums) {
            flag[num - 1] = false;
        }

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                System.out.println(i + 1);
            }
        }
    }
}
