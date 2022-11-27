package novice.mid.ch02.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddOrEven {

    public int getSum(int num) {
        if (num <= 2) {
            return num;
        }

        if (num % 2 == 0) {
            return getSum(num - 2) + num;
        } else {
            return getSum(num - 2) + num;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        OddOrEven oddOrEven = new OddOrEven();
        int sum = oddOrEven.getSum(N);
        System.out.println(sum);
    }
}
