package codingbasictraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 코딩 기초 트레이닝 > 배열 만들기 5
public class No181912 {

    public int[] solution(String[] intStrs, int k, int s, int l) {

        List<Integer> answerList = new ArrayList<>();
        for (String str : intStrs) {
            int num = Integer.parseInt(str.substring(s, s + l));
            if (num > k) {
                answerList.add(num);
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        No181912 no181912 = new No181912();
        int[] solution = no181912.solution(new String[]{"0123456789", "9876543210", "9999999999999"}, 50000, 5, 5);
        System.out.println(Arrays.toString(solution));
    }
}
