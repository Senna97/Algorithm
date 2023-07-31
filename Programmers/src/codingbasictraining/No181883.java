package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 수열과 구간 쿼리 1
public class No181883 {

    public int[] solution(int[] arr, int[][] queries) {

        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1]; i++) {
                arr[i] += 1;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        No181883 no181883 = new No181883();
        int[] solution = no181883.solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 1}, {1, 2}, {2, 3}});
        System.out.println(Arrays.toString(solution));
    }
}
