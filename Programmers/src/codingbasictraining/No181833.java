package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 특별한 이차원 배열 1
public class No181833 {

    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        No181833 no181833 = new No181833();
        int[][] solution = no181833.solution(3);
        System.out.println(Arrays.deepToString(solution));
    }
}
