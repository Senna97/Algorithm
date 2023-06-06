package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 배열 만들기 1
public class No181901 {

    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = k * (i + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        No181901 no181901 = new No181901();
        int[] solution = no181901.solution(10, 3);
        System.out.println(Arrays.toString(solution));
    }
}
