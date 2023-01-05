package summerwintercoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 프로그래머스 > Summer/Winter Coding(~2018) > 영어 끝말잇기
public class No12981 {

    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        Set<String> set = new HashSet<>();
        set.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (words[i - 1].charAt(words[i - 1].length() - 1) == words[i].charAt(0)) {
                set.add(words[i]);
            } else {
                answer[0] = (i + 1) % n;
                answer[1] = i / n + 1;
                if (answer[0] == 0) {
                    answer[0] = n;
                }
                break;
            }

            if (set.size() != i + 1) {
                answer[0] = (i + 1) % n;
                answer[1] = i / n + 1;
                if (answer[0] == 0) {
                    answer[0] = n;
                }
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No12981 no12981 = new No12981();
        int[] solution1 = no12981.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
        System.out.println(Arrays.toString(solution1));
        int[] solution2 = no12981.solution(2, new String[]{"ac", "ca", "ac", "ac"});
        System.out.println(Arrays.toString(solution2));
    }
}