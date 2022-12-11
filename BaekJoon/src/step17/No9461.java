package step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No9461 {

    public long getPadovanSequence(int n) {
        long[] memo = new long[n + 1];

        for (int i = 1; i < memo.length; i++) {
            if (i <= 3) {
                memo[i] = 1;
            } else {
                memo[i] = memo[i - 2] + memo[i - 3];
            }
        }

        return memo[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        No9461 no9461 = new No9461();

        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            long padovanSequence = no9461.getPadovanSequence(num);
            System.out.println(padovanSequence);
        }
    }
}