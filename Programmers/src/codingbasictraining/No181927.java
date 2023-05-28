package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 마지막 두 원소
public class No181927 {

    public int[] solution(int[] num_list) {

        int length = num_list.length;
        int[] answer = new int[length + 1];

        for (int i = 0; i < length; i++) {
            answer[i] = num_list[i];

            if (i == length - 1) {
                int last = num_list[i];
                int secondLast = num_list[i - 1];

                if (last > secondLast) {
                    answer[i + 1] = last - secondLast;
                } else {
                    answer[i + 1] = last * 2;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No181927 no181927 = new No181927();
        int[] solution = no181927.solution(new int[]{2, 1, 6});
        System.out.println(Arrays.toString(solution));
    }
}