package step06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class No5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split("");

        Map<String, Integer> hashMap = new HashMap<>();

        for (String s : strArr) {
            switch (s) {
                case "A": case "B": case "C":
                    hashMap.put(s, 2);
                    break;
                case "D": case "E": case "F":
                    hashMap.put(s, 3);
                    break;
                case "G": case "H": case "I":
                    hashMap.put(s, 4);
                    break;
                case "J": case "K": case "L":
                    hashMap.put(s, 5);
                    break;
                case "M": case "N": case "O":
                    hashMap.put(s, 6);
                    break;
                case "P": case "Q": case "R": case "S":
                    hashMap.put(s, 7);
                    break;
                case "T": case "U": case "V":
                    hashMap.put(s, 8);
                    break;
                case "W": case "X": case "Y": case "Z":
                    hashMap.put(s, 9);
                    break;
            }
        }

        int sum = 0;
        for (String s : strArr) {
            sum += hashMap.get(s);
        }

        System.out.println(sum + str.length());
    }
}
