package step07;

import java.util.Scanner;

public class No1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 고정 비용
        int B = sc.nextInt(); // 가변 비용
        int C = sc.nextInt(); // 가격

        int ans;
        if (B >= C) {
            ans = -1;
        } else {
            ans = A / (C - B) + 1;
        }
        System.out.println(ans);
    }
}