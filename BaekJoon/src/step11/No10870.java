package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10870 {

    public int getFibonacci(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        }

        return getFibonacci(num - 1) + getFibonacci(num - 2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        No10870 no10870 = new No10870();
        int fibonacci = no10870.getFibonacci(n);
        System.out.println(fibonacci);
    }
}
