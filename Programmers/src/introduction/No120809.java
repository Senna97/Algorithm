package introduction;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 입문 > 배열 두 배 만들기
public class No120809 {

    public int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        return numbers;
    }

    public static void main(String[] args) {
        No120809 no120809 = new No120809();
        int[] solution = no120809.solution(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(solution));
    }
}
