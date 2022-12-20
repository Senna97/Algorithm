package practice;

import java.util.Arrays;
import java.util.Collections;

// 프로그래머스 > 연습문제 > 야근 지수
public class No12927 {

    public long solution(int n, int[] works) {
        int sum = 0;
        for (int work : works) {
            sum += work;
        }

        if (sum <= n) {
            return 0;
        } else {
            Integer[] sortWorks = new Integer[works.length];
            for (int i = 0; i < works.length; i++) {
                sortWorks[i] = works[i];
            }
            Arrays.sort(sortWorks, Collections.reverseOrder());
            int index = 0;
            while (n > 0) {
                if ((index < 2 && sortWorks[index] >= sortWorks[index + 1]) || index == 2) {
                    sortWorks[index] -= 1;
                    n--;
                } else {
                    if (index > sortWorks.length - 1) {
                        index = index % sortWorks.length;
                    }

                    index++;
                }
            }

            long answer = 0;
            for (Integer sortWork : sortWorks) {
                answer += (long) sortWork * sortWork;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        No12927 no12927 = new No12927();
        long solution1 = no12927.solution(4, new int[]{4, 3, 3});
        System.out.println(solution1);
        long solution2 = no12927.solution(1, new int[]{2, 1, 2});
        System.out.println(solution2);
        long solution3 = no12927.solution(3, new int[]{1, 1});
        System.out.println(solution3);
    }
}
