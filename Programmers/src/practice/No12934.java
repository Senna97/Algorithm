package practice;

// 프로그래머스 > 연습문제 > 정수 제곱근 판별
public class No12934 {

    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
        long flag = (long) sqrt;

        if (sqrt == flag) {
            answer = (flag + 1) * (flag + 1);
        } else {
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        No12934 no12934 = new No12934();
        long solution1 = no12934.solution(121);
        System.out.println(solution1);
        long solution2 = no12934.solution(3);
        System.out.println(solution2);
    }
}
