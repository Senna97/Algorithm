package codingbasictraining;

import java.util.Scanner;

// 프로그래머스 > 코딩 기초 트레이닝 > 홀짝 구분하기
public class No181944 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }

}
