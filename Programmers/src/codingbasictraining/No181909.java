package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 접미사 배열
public class No181909 {

    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];

        for (int i = 0; i < answer.length; i++) {

            answer[i] = my_string.substring(i, my_string.length());
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        No181909 no181909 = new No181909();
        String[] solution = no181909.solution("banana");
        System.out.println(Arrays.toString(solution));
    }
}
