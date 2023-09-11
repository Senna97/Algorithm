package codingbasictraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 코딩 기초 트레이닝 > 그림 확대
public class No181836 {

    public String[] solution(String[] picture, int k) {

        List<String> list = new ArrayList<>();

        for (String line : picture) {

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < line.length(); i++) {
                for (int j = 0; j < k; j++) {
                    sb.append(line.charAt(i));
                }
            }

            for (int i = 0; i < k; i++) {
                list.add(sb.toString());
            }

        }

        String[] answer = new String[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        No181836 no181836 = new No181836();
        String[] solution = no181836.solution(new String[]{".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."}, 2);
        System.out.println(Arrays.toString(solution));
    }
}
