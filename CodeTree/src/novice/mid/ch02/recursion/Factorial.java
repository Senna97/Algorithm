package novice.mid.ch02.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

    public int getFactorial(int num) {
        if (num == 1) {
            return 1;
        }

        return num * getFactorial(num - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Factorial factorial = new Factorial();
        int answer = factorial.getFactorial(N);
        System.out.println(answer);
    }
}
