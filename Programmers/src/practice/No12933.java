package practice;

import java.util.Arrays;
import java.util.Collections;

public class No12933 {
    public long solution(long n) {
        long answer = 0;

        String str = "" + n;
        String[] splitted = str.split("");
        Arrays.sort(splitted, Collections.reverseOrder());

        StringBuilder memo = new StringBuilder();
        for (int i = 0; i < splitted.length; i++) {
            memo.append(splitted[i]);
        }
        answer = Long.parseLong(String.valueOf(memo));
        return answer;
    }

    public static void main(String[] args) {
        No12933 no12933 = new No12933();
        long solution = no12933.solution(118372);
        System.out.println(solution);
    }
}
