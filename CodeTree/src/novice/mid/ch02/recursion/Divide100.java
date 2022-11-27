package novice.mid.ch02.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divide100 {

    public int getNumber(int num) {
        if (num == 1) {
            return 2;
        } else if (num == 2) {
            return 4;
        }

        return (getNumber(num - 1) * getNumber(num - 2)) % 100;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Divide100 divide100 = new Divide100();
        int answer = divide100.getNumber(N);
        System.out.println(answer);
    }
}
