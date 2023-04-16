package introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 프로그래머스 > 코딩테스트 입문 > 가까운 수
public class No120890 {

    public int solution(int[] array, int n) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();

        for (int i : array) {
            list.add(i);
        }
        list.add(n);

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == n) {
                if (i == 0) {
                    answer = list.get(i + 1);
                } else if (i == list.size() - 1) {
                    answer = list.get(i - 1);
                } else {
                    int a = list.get(i) - list.get(i - 1);
                    int b = list.get(i + 1) - list.get(i);

                    if (b < a) {
                        answer = list.get(i + 1);
                    } else {
                        answer = list.get(i - 1);
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120890 no120890 = new No120890();
        int solution = no120890.solution(new int[]{13, 11, 5}, 12);
        System.out.println(solution);
    }
}
