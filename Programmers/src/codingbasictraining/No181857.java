package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 배열의 길이를 2의 거듭제곱으로 만들기
public class No181857 {

    public int[] solution(int[] arr) {

        int length = arr.length;
        int count = 0;

        while (true) {
            if (length >= 1) {
                length /= 2;
                count++;
            } else {
                break;
            }
        }

        int newLength = 1;
        for (int i = 0; i < count; i++) {
            newLength *= 2;
        }

        if (newLength / 2 == arr.length) {
            return arr;
        } else {
            int[] answer = new int[newLength];
            System.arraycopy(arr, 0, answer, 0, arr.length);

            return answer;
        }
    }

    public static void main(String[] args) {
        No181857 no181857 = new No181857();
        int[] solution = no181857.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        System.out.println(Arrays.toString(solution));
    }
}
