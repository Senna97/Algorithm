package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > n의 배수
public class No181937 {

    public int solution(int num, int n) {

        if (num % n == 0) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        No181937 no181937 = new No181937();
        int solution = no181937.solution(98, 2);
        System.out.println(solution);
    }
}
