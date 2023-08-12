package codingbasictraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 코딩 기초 트레이닝 > 세 개의 구분자
public class No181862 {

    public String[] solution(String myStr) {

        List<Character> chList = new ArrayList<>();

        for (int i = 0; i < myStr.length(); i++) {
            char ch = myStr.charAt(i);

            if (ch != 'a' && ch != 'b' && ch != 'c') {
                chList.add(ch);
            } else {
                chList.add('a');
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character ch : chList) {
            sb.append(ch);
        }

        List<String> strList = new ArrayList<>();
        String[] split = sb.toString().split("a");
        for (String str : split) {
            if (!str.equals("")) {
                strList.add(str);
            }
        }

        String[] answer = new String[strList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = strList.get(i);
        }

        if (answer.length == 0) {
            return new String[]{"EMPTY"};
        } else {
            return answer;
        }

    }

    public static void main(String[] args) {
        No181862 no181862 = new No181862();
        String[] solution = no181862.solution("cabab");
        System.out.println(Arrays.toString(solution));
    }
}
