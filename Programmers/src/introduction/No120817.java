package introduction;

// 프로그래머스 > 코딩테스트 입문 > 배열의 평균값
public class No120817 {

    public double solution(int[] numbers) {

        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }

    public static void main(String[] args) {
        No120817 no120817 = new No120817();
        double solution = no120817.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(solution);
    }
}
