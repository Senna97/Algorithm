package introduction;

import java.util.Arrays;
// 프로그래머스 > 코딩테스트 입문 > 배열 원소의 길이
public class No120854 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = strlist[i].length();
        }

        return answer;
    }

    public static void main(String[] args) {
        No120854 no120854 = new No120854();
        int[] solution = no120854.solution(new String[]{"We", "are", "the", "world!"});
        System.out.println(Arrays.toString(solution));
    }
}
