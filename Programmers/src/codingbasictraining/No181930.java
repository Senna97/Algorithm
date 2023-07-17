package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 주사위 게임 2
public class No181930 {

    public int solution(int a, int b, int c) {

        int sum = a + b + c;
        int doubleSum = a * a + b * b + c * c;
        int tripleSum = a * a * a + b * b * b + c * c * c;

        if ((a == b) && (b == c)) {
            return sum * doubleSum * tripleSum;
        } else if ((a == b) || (b == c) || (c == a)) {
            return sum * doubleSum;
        } else {
            return sum;
        }

    }

    public static void main(String[] args) {
        No181930 no181930 = new No181930();
        int solution = no181930.solution(2, 6, 1);
        System.out.println(solution);
    }
}
