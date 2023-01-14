package practice;

import java.util.Arrays;

// 프로그래머스 > 연습문제 > 행렬의 곱셈
public class No12949 {

    public int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = new int[arr1.length][arr2[0].length];

        // i*j X j*k = i*k
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No12949 no12949 = new No12949();
        int[][] solution = no12949.solution(new int[][]{{1, 2}, {3, 4}}, new int[][]{{1, 2, 3}, {4, 5, 6}});
        System.out.println(Arrays.deepToString(solution));
    }
}