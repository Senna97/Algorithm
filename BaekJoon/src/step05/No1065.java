package step05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No1065 {

    // X가 한수인지 판별하는 함수를 정의
    boolean judge(int X) {

        if (X < 100) {
            return true;
        } else if (X < 1000) {
            List<Integer> nums = new ArrayList<>();
            while (X > 0) {
                nums.add(X % 10);
                X = X / 10;
            }

            int d1 = nums.get(0) - nums.get(1);
            int d2 = nums.get(1) - nums.get(2);

            return d1 == d2;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        No1065 no1065 = new No1065();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (no1065.judge(i + 1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
