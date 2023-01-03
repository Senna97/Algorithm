package practice;

import java.util.Arrays;

// 프로그래머스 > 연습문제 > 최대공약수와 최소공배수
public class No12940 {

    public int[] solution(int n, int m) {

        int[] answer = new int[2];

        if (n > m) {
            while (n > m) {
                n -= m;
            }

        } else if (n < m) {
            while (n < m) {
                answer[0] = n - m;
            }
        } else {
            answer[0] = n;
            answer[1] = n;
        }

        return answer;
    }

    public static void main(String[] args) {
        No12940 no12940 = new No12940();
        int[] solution1 = no12940.solution(3, 12);
        System.out.println(Arrays.toString(solution1));
        int[] solution2 = no12940.solution(2, 5);
        System.out.println(Arrays.toString(solution2));
    }
}
