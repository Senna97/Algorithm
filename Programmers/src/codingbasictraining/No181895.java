package codingbasictraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 코딩 기초 트레이닝 > 배열 만들기 3
public class No181895 {

    public int[] solution(int[] arr, int[][] intervals) {

        List<Integer> answerList = new ArrayList<>();

        int length = 0;
        while (length < intervals.length) {

            int start = intervals[length][0];
            int end = intervals[length][1];

            for (int i = start; i <= end; i++) {
                answerList.add(arr[i]);
            }

            length++;
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        No181895 no181895 = new No181895();
        int[] solution = no181895.solution(new int[]{1, 2, 3, 4, 5}, new int[][]{{1, 3}, {0, 4}});
        System.out.println(Arrays.toString(solution));
    }
}
