package codingbasictraining;

import java.util.ArrayList;
import java.util.List;

// 프로그래머스 > 코딩 기초 트레이닝 > 세로 읽기
public class No181904 {

    public String solution(String my_string, int m, int c) {

        if (m == 1) {
            return my_string;
        } else {
            List<String> strings = new ArrayList<>();
            for (int i = 0; i < my_string.length() - m + 1; i += m) {
                strings.add(my_string.substring(i, i + m));
            }

            StringBuilder answer = new StringBuilder();
            for (String string : strings) {
                answer.append(string.charAt(c - 1));
            }

            return answer.toString();
        }

    }

    public static void main(String[] args) {
        No181904 no181904 = new No181904();
        String solution = no181904.solution("ihrhbakrfpndopljhygc", 4, 2);
        System.out.println(solution);
    }
}
