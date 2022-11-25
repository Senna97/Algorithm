package novice.mid.ch02.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repeat {

    public void repeatNums(int num) {
        if (num == 0) {
            return;
        }

        System.out.printf("%d ", num);
        repeatNums(num - 1);
        System.out.printf("%d ", num);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Repeat repeat = new Repeat();
        repeat.repeatNums(N);
    }
}
