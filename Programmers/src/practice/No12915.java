package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 프로그래머스 > 연습문제 > 문자열 내 마음대로 정렬하기
public class No12915 {

    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings);
        List<String> stringsList = new ArrayList<>(Arrays.asList(strings));

        List<Character> list = new ArrayList<>();
        for (String str : stringsList) {
            list.add(str.charAt(n));
        }
        Collections.sort(list);

        String[] answer = new String[strings.length];

        int stringsIndex = 0;
        int answerIndex = 0;
        while (!list.isEmpty()) {
            if (list.get(0).equals(stringsList.get(stringsIndex).charAt(n))) {
                answer[answerIndex] = stringsList.get(stringsIndex);
                list.remove(0);
                stringsList.remove(stringsIndex);
                answerIndex++;
                stringsIndex = 0;
            } else {
                stringsIndex++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No12915 no12915 = new No12915();
        String[] solution1 = no12915.solution(new String[]{"aea", "ba", "ce", "aee"}, 1);
        System.out.println(Arrays.toString(solution1));
        String[] solution2 = no12915.solution(new String[]{"abce", "abcd", "cdx"}, 2);
        System.out.println(Arrays.toString(solution2));
    }
}