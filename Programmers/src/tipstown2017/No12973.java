package tipstown2017;

import java.util.Stack;

// 프로그래머스 > 2017 팁스타운 > 짝지어 제거하기
public class No12973 {

    public int solution(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else if (stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        No12973 no12973 = new No12973();
        int solution1 = no12973.solution("baabaa");
        System.out.println(solution1);
        int solution2 = no12973.solution("cdcd");
        System.out.println(solution2);
    }
}