package codingbasictraining;

import java.util.Arrays;
import java.util.Stack;

// 프로그래머스 > 코딩 기초 트레이닝 > 배열 만들기 6
public class No181859 {

    public int[] solution(int[] arr) {

        Stack<Integer> stk = new Stack<>();

        for (int num : arr) {
            if (stk.size() == 0) {
                stk.push(num);
            } else if (stk.peek() == num) {
                stk.pop();
            } else {
                stk.push(num);
            }
        }

        if (stk.size() == 0) {
            return new int[]{-1};

        } else {
            int[] answer = new int[stk.size()];

            for (int i = answer.length - 1; i >= 0; i--) {
                answer[i] = stk.pop();
            }

            return answer;
        }

    }

    public static void main(String[] args) {
        No181859 no181859 = new No181859();
        int[] solution = no181859.solution(new int[]{0, 1, 1, 1, 0});
        System.out.println(Arrays.toString(solution));
    }
}
