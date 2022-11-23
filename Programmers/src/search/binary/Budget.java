package search.binary;

import java.util.Arrays;

// 36분 24초
public class Budget {

    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;

        for (int amount : d) {
            budget -= amount;

            if (budget < 0) {
                break;
            }

            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Budget budget = new Budget();
        int solution1 = budget.solution(new int[]{1, 3, 2, 5, 4}, 9);
        System.out.println(solution1); // 3
        int solution2 = budget.solution(new int[]{2, 2, 3, 3}, 10);
        System.out.println(solution2); // 4
    }

}
