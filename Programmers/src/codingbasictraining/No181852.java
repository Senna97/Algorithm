package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 뒤에서 5등 위로
public class No181852 {

    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];

        Arrays.sort(num_list);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i + 5];
        }

        return answer;
    }

    public static void main(String[] args) {
        No181852 no181852 = new No181852();
        int[] solution = no181852.solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10});
        System.out.println(Arrays.toString(solution));
    }
}
