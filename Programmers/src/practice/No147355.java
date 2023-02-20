package practice;

import java.util.ArrayList;
import java.util.List;

// 프로그래머스 > 연습문제 > 크기가 작은 부분 문자열
public class No147355 {

    public int solution(String t, String p) {
        int answer = 0;

        int start = 0;
        int end = p.length();
        List<String> list = new ArrayList<>();

        while (end != t.length() + 1) {
            list.add(t.substring(start, end));
            start++;
            end++;
        }

        for (String str : list) {
            if (Long.parseLong(str) <= Long.parseLong(p)) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No147355 no147355 = new No147355();
        int solution = no147355.solution("500220839878", "7");
        System.out.println(solution);
    }
}
