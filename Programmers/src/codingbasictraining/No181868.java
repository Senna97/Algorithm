package codingbasictraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 코딩 기초 트레이닝 > 공백으로 구분하기 2
public class No181868 {

    public String[] solution(String my_string) {

        List<String> strList = new ArrayList<>();
        String[] words = my_string.split(" ");
        for (String word : words) {
            if (!word.equals("")) {
                strList.add(word.trim());
            }
        }

        String[] answer = new String[strList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = strList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        No181868 no181868 = new No181868();
        String[] solution = no181868.solution(" i    love  you");
        System.out.println(Arrays.toString(solution));
    }
}
