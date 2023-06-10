package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 배열에서 문자열 대소문자 변환하기
public class No181875 {

    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];

        for (int i = 0; i < answer.length; i++) {
            if (i % 2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            } else {
                answer[i] = strArr[i].toUpperCase();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No181875 no181875 = new No181875();
        String[] solution = no181875.solution(new String[]{"AAA", "BBB", "CCC", "DDD"});
        System.out.println(Arrays.toString(solution));
    }
}
