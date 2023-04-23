package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 카운트 업
public class No181920 {

    public int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = start + i;
        }

        return answer;
    }

    public static void main(String[] args) {
        No181920 no181920 = new No181920();
        int[] solution = no181920.solution(3, 10);
        System.out.println(Arrays.toString(solution));
    }
}
