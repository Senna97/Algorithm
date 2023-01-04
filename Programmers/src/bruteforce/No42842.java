package bruteforce;

import java.util.Arrays;

// 프로그래머스 > 완전탐색 > 카펫
public class No42842 {

    public int[] solution(int brown, int yellow) {

        int[] answer = new int[2];

        for (int i = 1; i <= yellow; i++) {
            int j = yellow / i;
            if (i * j == yellow && (i + 2) * (j + 2) == brown + yellow) {
                answer[0] = i + 2;
                answer[1] = j + 2;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No42842 no42842 = new No42842();
        int[] solution1 = no42842.solution(10, 2);
        System.out.println(Arrays.toString(solution1));
        int[] solution2 = no42842.solution(8, 1);
        System.out.println(Arrays.toString(solution2));
        int[] solution3 = no42842.solution(24, 24);
        System.out.println(Arrays.toString(solution3));
    }
}