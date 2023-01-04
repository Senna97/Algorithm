package summerwintercoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 프로그래머스 > Summer/Winter Coding(~2018) > 영어 끝말잇기
public class No12981 {

    public int[] solution(int n, String[] words) {

        int[] answer = new int[2];

        Set<String> set = new HashSet<>();
        int i = 0;
        while (i < words.length) {
            if (i == words.length - 1) {
                set.add(words[i]);
            } else if (words[i].charAt(words[i].length() - 1) == words[i + 1].charAt(0)) {
                set.add(words[i]);
            }

            if (set.size() == words.length) {
                answer[0] = 0;
                answer[1] = 0;
            } else {
                if ((i + 1) % n == 0) {
                    answer[0] = n;
                    answer[1] = (i + 1) / n;
                } else {
                    answer[0] = (i + 1) % n;
                    answer[1] = (i + 1) / n;
                }
            }
            i++;
        }

        return answer;
    }

    public static void main(String[] args) {
        No12981 no12981 = new No12981();
        int[] solution = no12981.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
        System.out.println(Arrays.toString(solution));
    }
}