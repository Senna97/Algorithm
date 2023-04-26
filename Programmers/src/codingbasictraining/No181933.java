package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > flag에 따라 다른 값 반환하기
public class No181933 {

    public int solution(int a, int b, boolean flag) {

        if (flag) {
            return a + b;
        } else {
            return a - b;
        }

    }

    public static void main(String[] args) {
        No181933 no181933 = new No181933();
        int solution = no181933.solution(-4, 7, true);
        System.out.println(solution);
    }
}
