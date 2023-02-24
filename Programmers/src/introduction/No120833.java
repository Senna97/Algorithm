package introduction;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 입문 > 배열 자르기
public class No120833 {

    public int[] solution(int[] numbers, int num1, int num2) {

        return Arrays.copyOfRange(numbers, num1, num2+1);
    }

    public static void main(String[] args) {
        No120833 no120833 = new No120833();
        int[] solution = no120833.solution(new int[]{1, 2, 3, 4, 5}, 1, 3);
        System.out.println(Arrays.toString(solution));
    }
}