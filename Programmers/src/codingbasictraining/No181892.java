package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > n 번째 원소부터
public class No181892 {

    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[n - 1 + i];
        }

        return answer;
    }

    public static void main(String[] args) {
        No181892 no181892 = new No181892();
        int[] solution = no181892.solution(new int[]{5, 2, 1, 7, 5}, 2);
        System.out.println(Arrays.toString(solution));
    }
}
