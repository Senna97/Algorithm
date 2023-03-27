package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 코딩테스트 입문 > n의 배수 고르기
public class No120905 {

    public int[] solution(int n, int[] numlist) {

        List<Integer> list = new ArrayList<>();

        for (int num : numlist) {
            if (num % n == 0) {
                list.add(num);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        No120905 no120905 = new No120905();
        int[] solution = no120905.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12});
        System.out.println(Arrays.toString(solution));
    }
}
