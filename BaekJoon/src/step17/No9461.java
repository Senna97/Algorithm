package step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No9461 {

    public int getPadovanSequence(int n) {

        if (n <= 3) {
            return 1;
        }

        return getPadovanSequence(n - 2) + getPadovanSequence(n - 3);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        No9461 no9461 = new No9461();

        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            int padovanSequence = no9461.getPadovanSequence(num);
            System.out.println(padovanSequence);
        }
    }
}