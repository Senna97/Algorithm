package introduction;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 입문 > 최댓값 만들기(1)
public class No120847 {

    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        return numbers[length - 1] * numbers[length - 2];
    }

    public static void main(String[] args) {
        No120847 no120847 = new No120847();
        int solution = no120847.solution(new int[]{1, 2, 3, 4, 5});
        System.out.println(solution);
    }
}
