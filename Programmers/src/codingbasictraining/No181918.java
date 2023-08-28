package codingbasictraining;

import java.util.Arrays;
import java.util.Stack;

// 프로그래머스 > 코딩 기초 트레이닝 > 간단한 논리 연산
public class No181918 {

    public int[] solution(int[] arr) {

        Stack<Integer> stk = new Stack<>();

        int index = 0;
        while (index < arr.length) {
            if (stk.size() == 0) {
                stk.push(arr[index]);
                index++;
            } else if (stk.peek() < arr[index]) {
                stk.push(arr[index]);
                index++;
            } else if (stk.peek() >= arr[index]) {
                stk.pop();
            }
        }

        int[] answer = new int[stk.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stk.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        No181918 no181918 = new No181918();
        int[] solution = no181918.solution(new int[]{1, 4, 2, 5, 3});
        System.out.println(Arrays.toString(solution));
    }
}
