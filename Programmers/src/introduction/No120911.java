package introduction;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 입문 > 문자열 정렬하기 (2)
public class No120911 {

    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        String newMy_string = my_string.toLowerCase();
        String[] strArr = newMy_string.split("");
        Arrays.sort(strArr);

        for (String str : strArr) {
            answer.append(str);
        }

        return String.valueOf(answer);
    }

    public static void main(String[] args) {
        No120911 no120911 = new No120911();
        String solution = no120911.solution("Bcad");
        System.out.println(solution);
    }
}
