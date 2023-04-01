package introduction;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 입문 > 가장 큰 수 찾기
public class No120899 {

    public int[] solution(int[] array) {
        int[] answer = new int[2];

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
            answer[0] = max;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                answer[1] = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120899 no120899 = new No120899();
        int[] solution = no120899.solution(new int[]{1, 8, 3});
        System.out.println(Arrays.toString(solution));
    }
}
