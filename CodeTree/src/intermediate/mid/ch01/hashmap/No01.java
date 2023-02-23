package intermediate.mid.ch01.hashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// 알고리즘 기본 - 01 중급 자료구조 - HashMap - hashmap 기본
public class No01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String command = br.readLine();

            if (command.contains("add")) {
                String[] split = command.split(" ");
                hashMap.put(Integer.parseInt(split[1]), Integer.parseInt(split[2]));
            } else if (command.contains("remove")) {
                String[] split = command.split(" ");
                hashMap.remove(Integer.parseInt(split[1]));
            } else if (command.contains("find")) {
                String[] split = command.split(" ");
                if (hashMap.containsKey(Integer.parseInt(split[1]))) {
                    System.out.println(hashMap.get(Integer.parseInt(split[1])));
                } else {
                    System.out.println("None");
                }
            }
        }
    }
}
