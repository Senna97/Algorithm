package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No12935 {

    public int[] solution(int[] arr) {

        if (arr.length == 1) {
            return new int[]{-1};
        } else {
            List<Integer> list = new ArrayList<>();

            int min = arr[0];
            for (int i : arr) {
                min = Math.min(min, i);
            }

            for (int i : arr) {
                if (i != min) {
                    list.add(i);
                }
            }

            int[] answer = new int[arr.length - 1];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        No12935 no12935 = new No12935();
        int[] solution = no12935.solution(new int[]{4, 3, 1, 2});
        System.out.println(Arrays.toString(solution));
    }
}