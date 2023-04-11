package introduction;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 입문 > A로 B 만들기
public class No120886 {

    public int solution(String before, String after) {
        int answer = 0;

        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");

        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        for (int i = 0; i < beforeArr.length; i++) {
            if (beforeArr[i].equals(afterArr[i])) {
                answer = 1;
            } else {
                answer = 0;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        No120886 no120886 = new No120886();
        int solution = no120886.solution("olleh", "hello");
        System.out.println(solution);
    }
}
