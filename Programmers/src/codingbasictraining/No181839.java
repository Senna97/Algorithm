package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 주사위 게임 1
public class No181839 {

    public int solution(int a, int b) {

        if (a % 2 != 0 && b % 2 != 0) {
            return a * a + b * b;
        } else if (a % 2 != 0 || b % 2 != 0) {
            return 2 * (a + b);
        } else {
            if (a >= b) {
                return a - b;
            } else {
                return b - a;
            }
        }

    }

    public static void main(String[] args) {
        No181839 no181839 = new No181839();
        int solution = no181839.solution(3, 5);
        System.out.println(solution);
    }
}
