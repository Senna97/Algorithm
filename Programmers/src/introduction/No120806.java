package introduction;

// 프로그래머스 > 코딩테스트 입문 > 두 수의 나눗셈
public class No120806 {

    public int solution(int num1, int num2) {

        double answer = (double)num1 / num2 * 1000;
        return (int) answer;
    }

    public static void main(String[] args) {
        No120806 no120806 = new No120806();
        int solution1 = no120806.solution(3, 2);
        System.out.println(solution1);
        int solution2 = no120806.solution(7, 3);
        System.out.println(solution2);
    }
}
