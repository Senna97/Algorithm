package intermediate.mid.ch01.hashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// 알고리즘 기본 - 01 중급 자료구조 - HashMap - 대응되는 수와 문자
public class No04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] split = str.split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }

        HashMap<String, Integer> hashMap1 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hashMap1.put(words[i], i);
        }

        HashMap<Integer, String> hashMap2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hashMap2.put(i, words[i]);
        }

        String[] finds = new String[m];
        for (int i = 0; i < m; i++) {
            finds[i] = br.readLine();
        }

        for (int i = 0; i < m; i++) {
            if (hashMap1.containsKey(finds[i])) {
                System.out.println(hashMap1.get(finds[i]) + 1);
            } else {
                System.out.println(hashMap2.get(Integer.parseInt(finds[i]) - 1));
            }
        }
    }
}