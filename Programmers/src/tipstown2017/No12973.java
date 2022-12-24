package tipstown2017;

import java.util.ArrayList;
import java.util.List;

// 프로그래머스 > 2017 팁스타운 > 짝지어 제거하기
public class No12973 {

    public int solution(String s) {

        String[] split = s.split("");
        List<String> list = new ArrayList<>(List.of(split));

        int index = 0;
        while (list.size() != 0 && index < list.size() - 1) {

            if (list.get(index).equals(list.get(index + 1))) {
                list.remove(index);
                list.remove(index);
                index = 0;

            } else {
                index++;
            }
        }

        if (list.size() == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        No12973 no12973 = new No12973();
        int solution1 = no12973.solution("baabaa");
        System.out.println(solution1);
        int solution2 = no12973.solution("cdcd");
        System.out.println(solution2);
    }
}
