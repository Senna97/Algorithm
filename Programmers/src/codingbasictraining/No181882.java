package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 조건에 맞게 수열 변환하기 1
public class No181882 {

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                answer[i] = arr[i] * 2;
            } else {
                answer[i] = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No181882 no181882 = new No181882();
        int[] solution = no181882.solution(new int[]{1, 2, 3, 100, 99, 98});
        System.out.println(Arrays.toString(solution));
    }
}
