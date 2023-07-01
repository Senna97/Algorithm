package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 배열의 길이에 따라 다른 연산하기
public class No181854 {

    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 0) {
                if (i % 2 != 0) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            } else {
                if (i % 2 != 0) {
                    answer[i] = arr[i];
                } else {
                    answer[i] = arr[i] + n;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        No181854 no181854 = new No181854();
        int[] solution = no181854.solution(new int[]{49, 12, 100, 276, 33}, 27);
        System.out.println(Arrays.toString(solution));
    }
}
