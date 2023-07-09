package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 순서 바꾸기
public class No181891 {

    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];

        for (int i = n; i < num_list.length; i++) {
            answer[i - n] = num_list[i];
        }

        int difference = num_list.length - n;

        for (int i = 0; i < n; i++) {
            answer[i + difference] = num_list[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        No181891 no181891 = new No181891();
        int[] solution = no181891.solution(new int[]{5, 2, 1, 7, 5}, 3);
        System.out.println(Arrays.toString(solution));
    }
}
