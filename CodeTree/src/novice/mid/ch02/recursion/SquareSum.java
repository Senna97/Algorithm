package novice.mid.ch02.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareSum {

    public int getSquareSum(int num) {

        if (num < 10) {
            return (num % 10) * (num % 10);
        }

        return getSquareSum(num / 10) + (num % 10) * (num % 10);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        SquareSum squareSum = new SquareSum();
        int answer = squareSum.getSquareSum(N);
        System.out.println(answer);
    }
}
