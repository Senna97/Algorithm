package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > n 번째 원소까지
public class No181889 {

    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        No181889 no181889 = new No181889();
        int[] solution = no181889.solution(new int[]{2, 1, 6}, 1);
        System.out.println(Arrays.toString(solution));
    }
}
