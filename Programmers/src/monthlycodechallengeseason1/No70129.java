package monthlycodechallengeseason1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 월간 코드 챌린지 시즌1 > 이진 변환 반복하기
public class No70129 {
    List<Integer> counts = new ArrayList<>();
    int num = 0;

    public int[] solution(String s) {

        if (!s.equals("1")) {
            int count = 0;
            StringBuilder sb = new StringBuilder();
            String[] split = s.split("");
            for (String value : split) {
                if (value.equals("0")) {
                    count += 1;
                } else {
                    sb.append(value);
                }
            }
            counts.add(count);
            num++;
            solution(Integer.toBinaryString(sb.length()));
        }

        int[] answer = new int[2];
        answer[0] = num;
        for (Integer count : counts) {
            answer[1] += count;
        }
        return answer;
    }

    public static void main(String[] args) {
        No70129 no70129 = new No70129();
        int[] solution = no70129.solution("110010101001");
        System.out.println(Arrays.toString(solution));
    }
}