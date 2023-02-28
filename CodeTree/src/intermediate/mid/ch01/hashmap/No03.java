package intermediate.mid.ch01.hashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;

// 알고리즘 기본 - 01 중급 자료구조 - HashMap - 가장 많은 데이터
public class No03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hashMap.put(words[i], hashMap.getOrDefault(words[i], 0) + 1);
        }

        Integer max = Collections.max(hashMap.values());
        System.out.println(max);
    }
}