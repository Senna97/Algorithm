package codingbasictraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 코딩 기초 트레이닝 > 콜라츠 수열 만들기
public class No181919 {

    public int[] solution(int n) {

        List<Integer> answerList = new ArrayList<>();

        while (n != 1) {
            answerList.add(n);

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }

        answerList.add(1);

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        No181919 no181919 = new No181919();
        int[] solution = no181919.solution(10);
        System.out.println(Arrays.toString(solution));
    }
}
