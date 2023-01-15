package monthlycodechallengeseason1;

import java.util.Stack;

// 프로그래머스 > 월간 코드 챌린지 시즌2 > 괄호 회전하기
public class No76502 {

    int answer = 0;
    int num = 0;

    public int solution(String s) {
        num++;
        if (num == s.length()) {
            return answer;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else if (stack.peek() == '(' && s.charAt(i) == ')') {
                stack.pop();
            } else if (stack.peek() == '[' && s.charAt(i) == ']') {
                stack.pop();
            } else if (stack.peek() == '{' && s.charAt(i) == '}') {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        if (stack.isEmpty()) {
            answer++;
        }

        solution(rotate(s, num));

        return answer;
    }

    public String rotate(String str, int num) {
        return str.substring(1) + str.charAt(0);
    }

    public static void main(String[] args) {
        No76502 no76502 = new No76502();
        int solution1 = no76502.solution("[)(]");
        System.out.println(solution1);
    }
}