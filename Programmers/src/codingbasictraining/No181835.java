package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 조건에 맞게 수열 변환하기 3
public class No181835 {

    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];

        if (k % 2 == 0) {
            for (int i = 0; i < answer.length; i++) {
                answer[i] = arr[i] + k;
            }
        } else {
            for (int i = 0; i < answer.length; i++) {
                answer[i] = arr[i] * k;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No181835 no181835 = new No181835();
        int[] solution = no181835.solution(new int[]{1, 2, 3, 100, 99, 98}, 3);
        System.out.println(Arrays.toString(solution));
    }
}
