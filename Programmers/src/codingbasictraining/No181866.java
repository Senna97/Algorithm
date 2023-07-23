package codingbasictraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

// 프로그래머스 > 코딩 기초 트레이닝 > 문자열 잘라서 정렬하기
public class No181866 {

    public String[] solution(String myString) {

        String[] split = myString.split("x");

        List<String> answerList = new ArrayList<>();
        for (String str : split) {
            if (!Objects.equals(str, "")) {
                answerList.add(str);
            }
        }

        String[] answer = new String[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        No181866 no181866 = new No181866();
        String[] solution = no181866.solution("dxccxbbbxaaaa");
        System.out.println(Arrays.toString(solution));
    }
}
