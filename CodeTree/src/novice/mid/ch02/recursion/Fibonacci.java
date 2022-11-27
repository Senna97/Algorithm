package novice.mid.ch02.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

    public int getFibonacci(int num) {
        if (num <= 2) {
            return 1;
        }

        return getFibonacci(num - 1) + getFibonacci(num - 2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Fibonacci fibonacci = new Fibonacci();
        int answer = fibonacci.getFibonacci(N);
        System.out.println(answer);
    }
}
