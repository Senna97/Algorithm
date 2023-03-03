package introduction;

// 프로그래머스 > 코딩테스트 입문 > 순서쌍의 개수
public class No120836 {

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120836 no120836 = new No120836();
        int solution = no120836.solution(20);
        System.out.println(solution);
    }
}
