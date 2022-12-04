package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10872 {

    public int getFactorial(int num) {
        if (num == 0) {
            return 1;
        }

        return getFactorial(num - 1) * num;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        No10872 no10872 = new No10872();
        int factorial = no10872.getFactorial(N);
        System.out.println(factorial);
    }
}
