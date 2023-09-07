package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 정사각형으로 만들기
public class No181830 {

    public int[][] solution(int[][] arr) {
        int[][] answer;
        int side;

        if (arr.length == arr[0].length) {
            return arr;

        } else if (arr.length > arr[0].length) {
            side = arr.length;
            answer = new int[side][side];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    answer[i][j] = arr[i][j];
                }
            }

        } else {
            side = arr[0].length;
            answer = new int[side][side];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No181830 no181830 = new No181830();
        int[][] solution = no181830.solution(new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}});
        System.out.println(Arrays.deepToString(solution));
    }
}
