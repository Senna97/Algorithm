package introduction;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 프로그래머스 > 코딩테스트 입문 > 중복된 문자 제거
public class No120888 {

    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        String[] split = my_string.split("");
        Set<String> set = new HashSet<>(List.of(split));

        for (String str : split) {
            if (set.contains(str)) {
                answer.append(str);
                set.remove(str);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        No120888 no120888 = new No120888();
        String solution = no120888.solution("We are the world");
        System.out.println(solution);
    }

}
