package practice;

import java.util.Arrays;

// 프로그래머스 > 연습문제 > 최대공약수와 최소공배수
public class No12940 {

    public int[] solution(int n, int m) {

        int[] answer = new int[]{n, m};
        Arrays.sort(answer);

        int min = answer[0];
        int max = answer[1];

        for (int i = min; i >= 1; i--) {
            if (min % i == 0 && max % i == 0) {
                answer[0] = i;
                break;
            }
        }

        int i = 2;
        while (true) {
            if (max % min == 0) {
                answer[1] = max;
                break;
            } else {
                max = max / (i - 1) * i;
                i++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No12940 no12940 = new No12940();
        int[] solution1 = no12940.solution(3, 12);
        System.out.println(Arrays.toString(solution1));
        int[] solution2 = no12940.solution(7, 11);
        System.out.println(Arrays.toString(solution2));
    }
}