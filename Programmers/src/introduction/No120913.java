package introduction;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 입문 > 잘라서 배열로 저장하기
public class No120913 {

    public String[] solution(String my_str, int n) {

        String[] answer;
        if (my_str.length() % n == 0) {
            answer = new String[my_str.length() / n];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = my_str.substring(i * n, (i + 1) * n);
            }

        } else {
            answer = new String[my_str.length() / n + 1];

            for (int i = 0; i < my_str.length() / n; i++) {
                answer[i] = my_str.substring(i * n, (i + 1) * n);
            }

            answer[answer.length - 1] = my_str.substring((answer.length - 1) * n);
        }

        return answer;
    }

    public static void main(String[] args) {
        No120913 no120913 = new No120913();
        String[] solution = no120913.solution("abc1Addfggg4556b", 6);
        System.out.println(Arrays.toString(solution));
    }
}
