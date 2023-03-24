package introduction;

// 프로그래머스 > 코딩테스트 입문 > 세균 증식
public class No120910 {

    public int solution(int n, int t) {

        while (t > 0) {
            n *= 2;
            t -= 1;
        }

        return n;
    }

    public static void main(String[] args) {
        No120910 no120910 = new No120910();
        int solution = no120910.solution(2, 10);
        System.out.println(solution);
    }
}
