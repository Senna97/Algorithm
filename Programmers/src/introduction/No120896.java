package introduction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 프로그래머스 > 코딩테스트 입문 > 한 번만 등장한 문자
public class No120896 {

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Integer value : map.values()) {
            if (value == 1) {
                Character key = getKey(map, value);
                sb.append(key);
                map.put(key, 2);
            }
        }

        String[] split = sb.toString().split("");
        Arrays.sort(split);

        StringBuilder answer = new StringBuilder();
        for (String s1 : split) {
            answer.append(s1);
        }

        return answer.toString();
    }

    public static <K, V> K getKey(Map<K, V> map, V value) {

        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        No120896 no120896 = new No120896();
        String solution = no120896.solution("abdc");
        System.out.println(solution);
    }
}
