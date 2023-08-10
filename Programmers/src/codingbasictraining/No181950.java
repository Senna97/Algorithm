package codingbasictraining;

import java.util.Scanner;

// 프로그래머스 > 코딩 기초 트레이닝 > 문자열 반복해서 출력하기
public class No181950 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }

}
