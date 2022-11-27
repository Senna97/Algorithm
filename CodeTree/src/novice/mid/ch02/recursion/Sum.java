package novice.mid.ch02.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {

    public int getSum(int num) {
        if (num == 0) {
            return 0;
        }

        return getSum(num - 1) + num;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Sum sum = new Sum();
        int answer = sum.getSum(n);
        System.out.println(answer);
    }
}
