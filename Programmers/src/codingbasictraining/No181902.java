package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 문자 개수 세기
public class No181902 {

    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (ch >= 65 && ch <= 90) {
                answer[ch - 65] = answer[ch - 65] + 1;
            } else {
                answer[ch - 97 + 26] = answer[ch - 97 + 26] + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No181902 no181902 = new No181902();
        int[] solution = no181902.solution("Programmers");
        System.out.println(Arrays.toString(solution));
    }
}
