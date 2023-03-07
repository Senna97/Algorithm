package intermediate.mid.ch01.hashmap;

// 알고리즘 기본 - 01 중급 자료구조 - HashMap - 두 수의 합

import java.util.HashMap;
import java.util.Scanner;

public class No05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> count = new HashMap<>();
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int difference = k - numbers[i];

            if (count.containsKey(difference)) {
                answer += count.get(difference);
            }

            if (!count.containsKey(numbers[i])) {
                count.put(numbers[i], 1);
            } else {
                count.put(numbers[i], count.get(numbers[i]) + 1);
            }
        }
        System.out.println(answer);
    }
}