package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 홀짝에 따라 다른 값 반환하기
public class No181935 {

    public int solution(int n) {
        int answer = 0;

        if (n % 2 == 0) {
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    answer += (i * i);
                }
            }
        } else {
            for (int i = 0; i <= n; i++) {
                if (i % 2 != 0) {
                    answer += i;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No181935 no181935 = new No181935();
        int solution = no181935.solution(7);
        System.out.println(solution);
    }
}
