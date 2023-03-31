package introduction;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 입문 > 배열 회전시키기
public class No120844 {

    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        switch (direction) {
            case "right":
                answer[0] = numbers[numbers.length - 1];
                for (int i = 0; i < numbers.length - 1; i++) {
                    answer[i + 1] = numbers[i];
                }
                break;
            case "left":
                answer[answer.length - 1] = numbers[0];
                for (int i = 0; i < numbers.length - 1; i++) {
                    answer[i] = numbers[i + 1];
                }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120844 no120844 = new No120844();
        int[] solution = no120844.solution(new int[]{1, 2, 3}, "left");
        System.out.println(Arrays.toString(solution));
    }
}
