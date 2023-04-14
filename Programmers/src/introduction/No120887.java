package introduction;

import java.util.ArrayList;
import java.util.List;

// 프로그래머스 > 코딩테스트 입문 > k의 개수
public class No120887 {

    public int solution(int i, int j, int k) {
        int answer = 0;

        List<String> list = new ArrayList<>();
        for (int l = i; l <= j; l++) {
            list.add(String.valueOf(l));
        }

        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str);
        }

        for (int l = 0; l < sb.length(); l++) {
            char c = sb.toString().charAt(l);
            if (Character.toString(c).equals(String.valueOf(k))) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120887 no120887 = new No120887();
        int solution = no120887.solution(1, 13, 1);
        System.out.println(solution);
    }
}
