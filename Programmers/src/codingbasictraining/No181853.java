package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 뒤에서 5등까지
public class No181853 {

    public int[] solution(int[] num_list) {
        int[] answer = new int[5];

        Arrays.sort(num_list);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        No181853 no181853 = new No181853();
        int[] solution = no181853.solution(new int[]{12, 4, 15, 46, 38, 1, 14});
        System.out.println(Arrays.toString(solution));
    }
}
