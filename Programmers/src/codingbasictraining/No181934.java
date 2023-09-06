package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 조건 문자열
public class No181934 {

    public int solution(String ineq, String eq, int n, int m) {

        if (ineq.equals(">") && eq.equals("=")) {
            if (n >= m) {
                return 1;
            }
        } else if (ineq.equals("<") && eq.equals("=")) {
            if (n <= m) {
                return 1;
            }
        } else if (ineq.equals(">") && eq.equals("!")) {
            if (n > m) {
                return 1;
            }
        } else if (ineq.equals("<") && eq.equals("!")) {
            if (n < m) {
                return 1;
            }
        }

        return 0;

    }

    public static void main(String[] args) {
        No181934 no181934 = new No181934();
        int solution = no181934.solution("<", "=", 20, 50);
        System.out.println(solution);
    }
}
