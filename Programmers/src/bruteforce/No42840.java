package bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 완전탐색 > 모의고사
public class No42840 {

    public int[] solution(int[] answers) {

        List<Integer> list = new ArrayList<>();

        String str1 = "12345";
        String str2 = "21232425";
        String str3 = "3311224455";

        String std1 = str1.repeat(10000 / str1.length());
        String std2 = str2.repeat(10000 / str2.length());
        String std3 = str3.repeat(10000 / str3.length());

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (Integer.parseInt(String.valueOf(std1.charAt(i))) == answers[i]) {
                count1++;
            }

            if (Integer.parseInt(String.valueOf(std2.charAt(i))) == answers[i]) {
                count2++;
            }

            if (Integer.parseInt(String.valueOf(std3.charAt(i))) == answers[i]) {
                count3++;
            }
        }

        int max = Math.max(count1, count2);
        max = Math.max(max, count3);

        if (max == count1) {
            list.add(1);
        }

        if (max == count2) {
            list.add(2);
        }

        if (max == count3) {
            list.add(3);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        No42840 no42840 = new No42840();
        int[] solution1 = no42840.solution(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(solution1));
        int[] solution2 = no42840.solution(new int[]{1, 3, 2, 4, 2});
        System.out.println(Arrays.toString(solution2));
    }
}