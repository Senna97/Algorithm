package codingbasictraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 코딩 기초 트레이닝 > 배열 만들기 2
public class No181921 {

    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (i % 5 == 0) {
                String str = String.valueOf(i);

                if (str.contains("1") || str.contains("2") || str.contains("3") || str.contains("4") || str.contains("6") || str.contains("7") || str.contains("8") || str.contains("9")) {
                    continue;
                } else {
                    list.add(i);
                }
            }
        }

        if (list.size() == 0) {
            return new int[]{-1};

        } else {
            int[] answer = new int[list.size()];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }

    }

    public static void main(String[] args) {
        No181921 no181921 = new No181921();
        int[] solution = no181921.solution(5, 555);
        System.out.println(Arrays.toString(solution));
    }
}
