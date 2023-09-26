package codingbasictraining;

import java.util.Scanner;

// 프로그래머스 > 코딩 기초 트레이닝 > 대소문자 바꿔서 출력하기
public class No181949 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch >= 65 && ch <= 90) {
                sb.append(String.valueOf(ch).toLowerCase());
            } else if (ch >= 97 && ch <= 122) {
                sb.append(String.valueOf(ch).toUpperCase());
            }
        }

        System.out.println(sb);
    }
}
