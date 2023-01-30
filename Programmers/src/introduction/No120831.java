package introduction;

// 프로그래머스 > 코딩테스트 입문 > 짝수의 합
public class No120831 {

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120831 no120831 = new No120831();
        int solution = no120831.solution(10);
        System.out.println(solution);
    }
}
