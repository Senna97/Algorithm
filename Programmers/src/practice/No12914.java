package practice;

// 프로그래머스 > 연습문제 > 멀리 뛰기
public class No12914 {

    public long solution(int n) {

        long[] memo = new long[n + 1];
        memo[0] = 1;
        memo[1] = 2;

        if (n > 2) {
            for (int i = 2; i < memo.length; i++) {
                memo[i] = (memo[i - 2] + memo[i - 1]) % 1234567;
            }
        }

        return memo[n - 1];
    }

    public static void main(String[] args) {
        No12914 no12914 = new No12914();
        long solution1 = no12914.solution(3);
        System.out.println(solution1);
        long solution2 = no12914.solution(4);
        System.out.println(solution2);
    }
}