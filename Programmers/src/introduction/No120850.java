package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 코딩테스트 입문 > 문자열 정렬하기 (1)
public class No120850 {

    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            if (!(my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z') && !(my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z')) {
                list.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        No120850 no120850 = new No120850();
        int[] solution = no120850.solution("hi12392");
        System.out.println(Arrays.toString(solution));
    }
}
