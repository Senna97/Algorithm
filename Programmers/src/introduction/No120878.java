package introduction;

// 프로그래머스 > 코딩테스트 입문 > 유한소수 판별하기
public class No120878 {

    public int solution(int a, int b) {

        int max = Math.max(a, b);
        for (int i = 2; i <= max; i++) {
            if (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
        }

        if (a >= b && a % b == 0) {
            return 1;

        } else {

            int answer = 1;

            if (b % a == 0) {
                b /= a;
            }

            while (b != 1) {
                if (b % 2 == 0) {
                    b /= 2;
                } else if (b % 5 == 0) {
                    b /= 5;
                } else {
                    answer = 2;
                    break;
                }
            }

            return answer;
        }

    }

    public static void main(String[] args) {
        No120878 no120878 = new No120878();
        int solution = no120878.solution(7, 20);
        System.out.println(solution);
    }
}
