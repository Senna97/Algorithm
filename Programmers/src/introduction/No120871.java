package introduction;

import java.util.ArrayList;
import java.util.List;

// 프로그래머스 > 코딩테스트 입문 > 저주의 숫자 3
public class No120871 {

    public int solution(int n) {
        int num = 1;
        List<Integer> list = new ArrayList<>();

        while (list.size() < n) {
            if (num % 3 != 0) {
                String strNum = String.valueOf(num);

                if (!strNum.contains("3")) {
                    list.add(num);
                }

            }

            num++;
        }

        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        No120871 no120871 = new No120871();
        int solution = no120871.solution(15);
        System.out.println(solution);
    }
}
