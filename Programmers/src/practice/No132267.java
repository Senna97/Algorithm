package practice;

// 프로그래머스 > 연습문제 > 콜라 문제
public class No132267 {

    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {

            answer += n / a * b;
            int remain = n % a;
            n = n / a * b + remain;
        }

        return answer;
    }

    public static void main(String[] args) {
        No132267 no132267 = new No132267();
        int solution = no132267.solution(5, 3, 21);
        System.out.println(solution);
    }
}
