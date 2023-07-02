package codingbasictraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 코딩 기초 트레이닝 > 5명씩
public class No181886 {

    public String[] solution(String[] names) {

        List<String> strList = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                strList.add(names[i]);
            }
        }

        String[] answer = new String[strList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = strList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        No181886 no181886 = new No181886();
        String[] solution = no181886.solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"});
        System.out.println(Arrays.toString(solution));
    }
}
