package introduction;

// 프로그래머스 > 코딩테스트 입문 > 종이 자르기
public class No120922 {

    public int solution(int M, int N) {

        if (M == 1 && N == 1) {
            return 0;

        } else {
            return (M - 1) + (N - 1) * M;

        }
    }

    public static void main(String[] args) {
        No120922 no120922 = new No120922();
        int solution = no120922.solution(2, 2);
        System.out.println(solution);
    }
}
