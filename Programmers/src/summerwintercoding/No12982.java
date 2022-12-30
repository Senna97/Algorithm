package summerwintercoding;

import java.util.Arrays;

// 프로그래머스 > Summer/Winter Coding(~2018) > 예산
public class No12982 {

    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);

        for (int amount : d) {
            sum += amount;

            if (sum > budget) {
                break;
            }
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        No12982 no12982 = new No12982();
        int solution1 = no12982.solution(new int[]{1, 3, 2, 5, 4}, 9);
        System.out.println(solution1); // 3
        int solution2 = no12982.solution(new int[]{2, 2, 3, 3}, 10);
        System.out.println(solution2); // 4
    }
}