package codingbasictraining;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 프로그래머스 > 코딩 기초 트레이닝 > 문자열 묶기
public class No181855 {
    public int solution(String[] strArr) {

        int[] wordLength = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            wordLength[i] = strArr[i].length();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int length : wordLength) {
            int value;

            if (map.containsKey(length)) {
                value = map.get(length);
                map.remove(length);

            } else {
                value = 0;

            }

            map.put(length, value + 1);
        }

        return Collections.max(map.values());
    }

    public static void main(String[] args) {
        No181855 no181855 = new No181855();
        int solution = no181855.solution(new String[]{"a", "bc", "d", "efg", "hi"});
        System.out.println(solution);
    }
}
