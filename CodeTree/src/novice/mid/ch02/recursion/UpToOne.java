package novice.mid.ch02.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpToOne {

    public int divideUpToOne(int num, int count) {
        if (num == 1) {
            return count;
        }

        if (num % 2 == 0) {
            return divideUpToOne(num / 2, count + 1);
        } else {
            return divideUpToOne(num / 3, count + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        UpToOne upToOne = new UpToOne();
        int answer = upToOne.divideUpToOne(N, 0);
        System.out.println(answer);
    }
}
