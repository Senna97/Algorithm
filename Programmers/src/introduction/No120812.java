package introduction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 프로그래머스 > 코딩테스트 입문 > 최빈값 구하기
public class No120812 {

    public int solution(int[] array) {

        Map<Integer, Integer> map = new HashMap<>();
        int count = 1;

        for (int num : array) {
            if (map.containsKey(num)) {
                Integer newCount = map.get(num);
                map.remove(num);
                map.put(num, newCount + 1);
            } else {
                map.put(num, count);
            }
        }

        int index = 0;
        int max = 0;
        int answer = 0;
        List<Integer> values = new ArrayList<>();
        for (int key : map.keySet()) {
            if (index <= map.size()) {
                max = Math.max(max, map.get(key));
                values.add(map.get(key));
            }

            if (max == map.get(key)) {
                answer = key;
            }

            index++;
        }

        int duplication = 0;
        for (Integer value : values) {
            if (value == max) {
                duplication++;
            }
        }

        if (duplication == 1) {
            return answer;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        No120812 no120812 = new No120812();
        int solution = no120812.solution(new int[]{1, 2, 3, 3, 3, 4});
        System.out.println(solution);
    }
}
