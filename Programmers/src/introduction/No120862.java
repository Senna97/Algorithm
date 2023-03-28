package introduction;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 입문 > 최댓값 만들기 (2)
public class No120862 {

    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;

        return Math.max(numbers[0] * numbers[1], numbers[length - 2] * numbers[length - 1]);
    }

    public static void main(String[] args) {
        No120862 no120862 = new No120862();
        int solution = no120862.solution(new int[]{1, 2, -3, 4, -5});
        System.out.println(solution);
    }
}
