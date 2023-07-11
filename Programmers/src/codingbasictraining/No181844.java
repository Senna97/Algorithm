package codingbasictraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 코딩 기초 트레이닝 > 배열의 원소 삭제하기
public class No181844 {

    public int[] solution(int[] arr, int[] delete_list) {

        for (int i = 0; i < arr.length; i++) {
            for (int j : delete_list) {
                if (arr[i] == j) {
                    arr[i] = -1;
                    break;
                }
            }
        }

        List<Integer> list1 = new ArrayList<>();
        for (int i : arr) {
            if (i != -1) {
                list1.add(i);
            }
        }

        if (list1.size() == arr.length) {
            return arr;
        } else {
            int[] answer = new int[list1.size()];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = list1.get(i);
            }

            return answer;
        }

    }

    public static void main(String[] args) {
        No181844 no181844 = new No181844();
        int[] solution = no181844.solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12});
        System.out.println(Arrays.toString(solution));
    }
}
