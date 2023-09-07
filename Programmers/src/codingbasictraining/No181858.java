package codingbasictraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 코딩 기초 트레이닝 > 무작위로 K개의 수 뽑기
public class No181858 {

    public int[] solution(int[] arr, int k) {

        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        int[] answer = new int[k];
        if (k > list.size()) {
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        } else {
            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }
        }

        int index = k - 1;
        while (answer[index] == 0) {
            answer[index] = -1;
            index--;
        }

        return answer;
    }

    public static void main(String[] args) {
        No181858 no181858 = new No181858();
        int[] solution = no181858.solution(new int[]{0, 1, 1, 2, 2, 3}, 3);
        System.out.println(Arrays.toString(solution));
    }
}
