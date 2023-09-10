package introduction;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 입문 > 외계어 사전
public class No120869 {

    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        Arrays.sort(spell);

        for (String word : dic) {
            if (word.length() == spell.length) {
                String[] split = word.split("");
                Arrays.sort(split);

                for (int i = 0; i < split.length; i++) {
                    if (!split[i].equals(spell[i])) {
                        answer = 2;
                        break;
                    } else {
                        answer = 1;
                    }

                }

            }

        }

        return answer;
    }

    public static void main(String[] args) {
        No120869 no120869 = new No120869();
        int solution = no120869.solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"});
        System.out.println(solution);
    }
}
