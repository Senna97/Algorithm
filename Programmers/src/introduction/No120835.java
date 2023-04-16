package introduction;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 입문 > 진료순서 정하기
public class No120835 {

    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        int order = 1;

        while (order <= emergency.length) {
            int max = 0;

            for (int i : emergency) {
                max = Math.max(max, i);
            }

            for (int i = 0; i < emergency.length; i++) {
                if (max == emergency[i]) {
                    answer[i] = order;
                    emergency[i] = 0;
                }
            }

            order++;
        }

        return answer;
    }

    public static void main(String[] args) {
        No120835 no120835 = new No120835();
        int[] solution = no120835.solution(new int[]{3, 76, 24});
        System.out.println(Arrays.toString(solution));
    }
}
