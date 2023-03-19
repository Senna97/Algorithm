package introduction;

// 프로그래머스 > 코딩테스트 입문 > 제곱수 판별하기
public class No120909 {

    public int solution(int n) {
        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt == n) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        No120909 no120909 = new No120909();
        int solution = no120909.solution(144);
        System.out.println(solution);
    }
}
