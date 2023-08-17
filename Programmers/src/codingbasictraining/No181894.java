package codingbasictraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 코딩 기초 트레이닝 > 2의 영역
public class No181894 {

    public int[] solution(int[] arr) {

        List<Integer> indexOfTwo = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                indexOfTwo.add(i);
            }
        }

        if (indexOfTwo.size() == 0) {
            return new int[]{-1};

        } else {
            int start = indexOfTwo.get(0);
            int end = indexOfTwo.get(indexOfTwo.size() - 1);

            List<Integer> list = new ArrayList<>();
            for (int i = start; i <= end; i++) {
                list.add(arr[i]);
            }

            int[] answer = new int[list.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }

    }

    public static void main(String[] args) {
        No181894 no181894 = new No181894();
        int[] solution = no181894.solution(new int[]{1, 2, 1, 4, 5, 2, 9});
        System.out.println(Arrays.toString(solution));
    }
}
