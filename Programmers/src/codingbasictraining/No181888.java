package codingbasictraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 코딩 기초 트레이닝 > n보다 커질 때까지 더하기
public class No181888 {

    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();

        int index = 0;
        while (index < num_list.length) {

            list.add(num_list[index]);
            index += n;
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        No181888 no181888 = new No181888();
        int[] solution = no181888.solution(new int[]{4, 2, 6, 1, 7, 6}, 2);
        System.out.println(Arrays.toString(solution));
    }
}
