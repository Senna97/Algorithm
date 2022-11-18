package step06;

import java.util.Arrays;
import java.util.Scanner;

public class No1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();

        int[] intArr = new int[26];
        Arrays.fill(intArr, 0);

        for (int i = 0; i < str.length(); i++) {
            intArr[(int) str.charAt(i) - 65]++;
        }

        int maxIdx = 0;
        int max = intArr[maxIdx];
        for (int i = 0; i < intArr.length; i++) {
            if (max < intArr[i]) {
                max = intArr[i];
                maxIdx = i;
            }
        }

        int count = 0;
        for (int i : intArr) {
            if (i == max) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println('?');
        } else {
            System.out.println((char) (maxIdx + 65));
        }
    }
}