package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 공배수
public class No181936 {

    public int solution(int number, int n, int m) {

        if (number % n == 0 && number % m == 0) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        No181936 no181936 = new No181936();
        int solution = no181936.solution(60, 2, 3);
        System.out.println(solution);
    }
}
