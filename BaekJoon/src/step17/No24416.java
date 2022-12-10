package step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No24416 {

    static int recursionCnt = 0;
    static int dpCnt = 0;


    public int getFibonacciRecursion(int n) {

        if (n <= 2) {
            recursionCnt++;
            return 1;
        }

        return getFibonacciRecursion(n - 1) + getFibonacciRecursion(n - 2);
    }

    public int getFibonacciDp(int n) {
        int[] memo = new int[n + 1];

        memo[1] = 1;
        memo[2] = 1;

        for (int i = 3; i < memo.length; i++) {
            dpCnt++;
            memo[i] = memo[i - 2] + memo[i - 1];
        }

        return memo[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        No24416 no24416 = new No24416();
        no24416.getFibonacciRecursion(n);
        no24416.getFibonacciDp(n);
        System.out.printf("%d %d", recursionCnt, dpCnt);
    }
}
