package practice;

import java.util.Arrays;
import java.util.Collections;

// 프로그래머스 > 연습문제 > 문자열 내림차순으로 배치하기
public class No12917 {

    public String solution(String s) {
        String[] splitted = s.split("");
        Arrays.sort(splitted, Collections.reverseOrder());

        StringBuilder memo = new StringBuilder();
        for (String str : splitted) {
            memo.append(str);
        }

        return String.valueOf(memo);
    }

    public static void main(String[] args) {
        No12917 no12917 = new No12917();
        String solution = no12917.solution("Zbcdefg");
        System.out.println(solution);
    }
}
