package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > x 사이의 개수
public class No181867 {

    public int[] solution(String myString) {
        String end = myString.substring(myString.length() - 1);
        String[] split = myString.split("x");

        int[] answer;

        if (end.equals("x")) {
            answer = new int[split.length + 1];

            for (int i = 0; i < split.length; i++) {
                answer[i] = split[i].length();
            }

            answer[answer.length - 1] = 0;

        } else {
            answer = new int[split.length];

            for (int i = 0; i < split.length; i++) {
                answer[i] = split[i].length();
            }

        }

        return answer;

    }

    public static void main(String[] args) {
        No181867 no181867 = new No181867();
        int[] solution = no181867.solution("oxooxoxxox");
        System.out.println(Arrays.toString(solution));
    }
}
