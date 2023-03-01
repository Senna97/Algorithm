package introduction;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 프로그래머스 > 코딩테스트 입문 > 배열의 유사도
public class No120903 {

    public int solution(String[] s1, String[] s2) {

        Set<String> set = new HashSet<>();

        set.addAll(Arrays.asList(s1));
        set.addAll(Arrays.asList(s2));

        return s1.length + s2.length - set.size();
    }

    public static void main(String[] args) {
        No120903 no120903 = new No120903();
        int solution = no120903.solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"});
        System.out.println(solution);
    }
}
