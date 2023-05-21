package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 카운트 다운
public class No181899 {

    public int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = start - i;
        }

        return answer;
    }

    public static void main(String[] args) {
        No181899 no181899 = new No181899();
        int[] solution = no181899.solution(10, 3);
        System.out.println(Arrays.toString(solution));
    }
}
