package intermediate.mid.ch01.hashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// 알고리즘 기본 - 01 중급 자료구조 - HashMap - 숫자 등장 횟수
public class No02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nAndM = br.readLine();
        String[] split = nAndM.split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        String elements = br.readLine();
        String[] elementsArr = elements.split(" ");

        for (int i = 0; i < n; i++) {
            hashMap.put(i, Integer.valueOf(elementsArr[i]));
        }

        String finds = br.readLine();
        String[] findsArr = finds.split(" ");

        int[] counts = new int[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (hashMap.get(j) == Integer.parseInt(findsArr[i])) {
                    counts[i]++;
                }
            }
        }

        for (int count : counts) {
            System.out.print(count + " ");
        }
    }
}