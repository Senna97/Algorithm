package practice;

// 프로그래머스 > 연습문제 > 피보나치 수
public class No12945 {
    public int solution(int n) {
        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 1;

        for (int i = 3; i < memo.length; i++) {
            memo[i] = (memo[i - 1] + memo[i - 2]) % 1234567;
        }

        return memo[n];
    }

    public static void main(String[] args) {
        No12945 no12945 = new No12945();
        int solution = no12945.solution(3);
        System.out.println(solution);
    }
}
