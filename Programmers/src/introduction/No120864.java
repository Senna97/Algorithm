package introduction;

import java.util.Objects;

// 프로그래머스 > 코딩테스트 입문 > 숨어있는 숫자의 덧셈 (2)
public class No120864 {

    public int solution(String my_string) {
        int answer = 0;

        String[] strings = my_string.split("[a-zA-z]+");

        for (String str : strings) {
            if (!Objects.equals(str, "")) {
                answer += Integer.parseInt(str);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120864 no120864 = new No120864();
        int solution = no120864.solution("aAb1B2cC34oOp");
        System.out.println(solution);
    }
}
