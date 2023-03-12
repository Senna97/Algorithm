package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 코딩테스트 입문 > 짝수는 싫어요
public class No120813 {

    public int[] solution(int n) {

        int length;
        if (n % 2 == 0) {
            length = n / 2;
        } else {
            length = n / 2 + 1;
        }

        int[] answer = new int[length];

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                list.add(i);
            }
        }

        for (int i = 0; i < length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        No120813 no120813 = new No120813();
        int[] solution = no120813.solution(10);
        System.out.println(Arrays.toString(solution));
    }
}
