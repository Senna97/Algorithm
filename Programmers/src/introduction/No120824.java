package introduction;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 입문 > 짝수 홀수 개수
public class No120824 {

    public int[] solution(int[] num_list) {
        int[] answer = new int[]{0, 0};

        for (int num : num_list) {
            if (num % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120824 no120824 = new No120824();
        int[] solution = no120824.solution(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(solution));
    }
}
