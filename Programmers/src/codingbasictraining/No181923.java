package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 수열과 구간 쿼리 2
public class No181923 {
    public int[] solution(int[] arr, int[][] queries) {

        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            answer[i] = -1;

            for (int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    if (answer[i] == -1) {
                        answer[i] = arr[j];
                    } else {
                        answer[i] = Math.min(answer[i], arr[j]);
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No181923 no181923 = new No181923();
        int[] solution = no181923.solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}});
        System.out.println(Arrays.toString(solution));
    }
}
