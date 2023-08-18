package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 코딩테스트 입문 > 소인수분해
public class No120852 {

    public int[] solution(int n) {

        List<Integer> list = new ArrayList<>();

        int divide = 2;
        int originalN = n;

        while (divide < originalN) {

            if (n % divide == 0) {
                if (!list.contains(divide)) {
                    list.add(divide);
                }

                n /= divide;

            } else {
                divide++;
            }

        }

        if (list.size() == 0) {
            return new int[]{n};

        } else {
            int[] answer = new int[list.size()];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }

            return answer;

        }

    }

    public static void main(String[] args) {
        No120852 no120852 = new No120852();
        int[] solution = no120852.solution(12);
        System.out.println(Arrays.toString(solution));
    }
}
