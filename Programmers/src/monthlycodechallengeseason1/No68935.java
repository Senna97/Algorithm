package monthlycodechallengeseason1;

import java.util.Stack;

// 코딩테스트 연습 > 월간 코드 챌린지 시즌1 > 3진법 뒤집기
public class No68935 {

    public int solution(int n) {
        int answer = 0;

        int num = 0;
        while (true) {
            if (n < Math.pow(3, num)) {
                num--;
                break;
            } else {
                num++;
            }
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = num; i >= 0; i--) {
            if (n >= Math.pow(3, i) && n >= 0) {
                stack.push((int) (n / Math.pow(3, i)));
                n -= Math.pow(3, i) * stack.peek();
            } else {
                stack.push(0);
            }
        }

        for (int i = num; i >= 0; i--) {
            answer += stack.pop() * Math.pow(3, i);
        }

        return answer;
    }

    public static void main(String[] args) {
        No68935 no68935 = new No68935();
        int solution1 = no68935.solution(45);
        System.out.println(solution1);
        int solution2 = no68935.solution(125);
        System.out.println(solution2);
    }
}