package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 두 수의 연산값 비교하기
public class No181938 {

    public int solution(int a, int b) {

        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        String strSum = strA + strB;
        int sum = Integer.parseInt(strSum);

        int multiply = 2 * a * b;

        return Math.max(sum, multiply);

    }

    public static void main(String[] args) {
        No181938 no181938 = new No181938();
        int solution = no181938.solution(2, 91);
        System.out.println(solution);
    }
}
