package introduction;

import java.util.Arrays;
import java.util.Stack;

// 프로그래머스 > 코딩테스트 입문 > 배열 뒤집기
public class No120821 {

    public int[] solution(int[] num_list) {

        int[] answer = new int[num_list.length];

        Stack<Integer> stack = new Stack<>();
        for (int num : num_list) {
            stack.push(num);
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        No120821 no120821 = new No120821();
        int[] solution = no120821.solution(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(solution));
    }
}
