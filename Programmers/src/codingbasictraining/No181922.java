package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 수열과 구간 쿼리 4
public class No181922 {

    public int[] solution(int[] arr, int[][] queries) {

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            for (int i = 0; i < arr.length; i++) {
                if (i >= s && i <= e && i % k == 0) {
                    arr[i]++;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        No181922 no181922 = new No181922();
        int[] solution = no181922.solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 1}, {0, 3, 2}, {0, 3, 3}});
        System.out.println(Arrays.toString(solution));
    }
}
