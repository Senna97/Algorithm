package introduction;

import java.util.Scanner;

// 프로그래머스 > 코딩테스트 입문 > 직각삼각형 출력하기
public class No120823 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}