package codingbasictraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 코딩 기초 트레이닝 > ad 제거하기
public class No181870 {

    public String[] solution(String[] strArr) {

        List<String> strings = new ArrayList<>();

        for (String str : strArr) {
            if (!str.contains("ad")) {
                strings.add(str);
            }
        }

        String[] answer = new String[strings.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = strings.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        No181870 no181870 = new No181870();
        String[] solution = no181870.solution(new String[]{"and", "notad", "abcd"});
        System.out.println(Arrays.toString(solution));
    }
}
