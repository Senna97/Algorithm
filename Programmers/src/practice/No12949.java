package practice;

import java.util.Arrays;

// 프로그래머스 > 연습문제 > 행렬의 곱셈
public class No12949 {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        // i*j X j*k = i*k
        // index1 = i만큼
        // index2 = k만큼
        // 더할 원소의 개수는 j만큼

        // 3*2 X 2*2 = 3*2
//        int index = 0;
//        while (index < answer.length) {
//            answer[index][0] = arr1[index][0] * arr2[0][0] + arr1[index][1] * arr2[1][0];
//            answer[index][1] = arr1[index][0] * arr2[0][1] + arr1[index][1] * arr2[1][1];
//            index++;
//        }

        // 3*3 X 3*3 = 3*3
//        int index = 0;
//        while (index < answer.length) {
//            answer[index][0] = arr1[index][0] * arr2[0][0] + arr1[index][1] * arr2[1][0] + arr1[index][2] * arr2[2][0];
//            answer[index][1] = arr1[index][0] * arr2[0][1] + arr1[index][1] * arr2[1][1] + arr1[index][2] * arr2[2][1];
//            answer[index][2] = arr1[index][0] * arr2[0][2] + arr1[index][1] * arr2[1][2] + arr1[index][2] * arr2[2][2];
//            index++;
//        }

        // 2*2 X 2*3 = 2*3
        int index = 0;
        while (index < answer.length) {
            answer[index][0] = arr1[index][0] * arr2[0][0] + arr1[index][1] * arr2[1][0];
            answer[index][1] = arr1[index][0] * arr2[0][1] + arr1[index][1] * arr2[1][1];
            answer[index][2] = arr1[index][0] * arr2[0][2] + arr1[index][1] * arr2[1][2];
            index++;
        }

        return answer;
    }

    public static void main(String[] args) {
        No12949 no12949 = new No12949();
        int[][] solution = no12949.solution(new int[][]{{1, 2}, {3, 4}}, new int[][]{{1, 2, 3}, {4, 5, 6}});
        System.out.println(Arrays.deepToString(solution));
    }
}