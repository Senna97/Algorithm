package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 수열과 구간 쿼리 3
public class No181924 {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];

        for (int[] query : queries) {
            answer = alter(arr, query[0], query[1]);
        }

        return answer;
    }

    public int[] alter(int[] arr, int i, int j) {
        int a = arr[i];
        int b = arr[j];
        int temp;

        temp = a;
        arr[i] = b;
        arr[j] = temp;

        return arr;
    }

    public static void main(String[] args) {
        No181924 no181924 = new No181924();
        int[] solution = no181924.solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3}, {1, 2}, {1, 4}});
        System.out.println(Arrays.toString(solution));
    }
}
