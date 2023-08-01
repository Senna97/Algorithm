package codingbasictraining;

import java.util.Arrays;
import java.util.Stack;

// 프로그래머스 > 코딩 기초 트레이닝 > 빈 배열에 추가, 삭제하기
public class No181860 {

    public int[] solution(int[] arr, boolean[] flag) {

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    stack.push(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    stack.pop();
                }
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        No181860 no181860 = new No181860();
        int[] solution = no181860.solution(new int[]{3, 2, 4, 1, 3}, new boolean[]{true, false, true, false, false});
        System.out.println(Arrays.toString(solution));
    }
}
