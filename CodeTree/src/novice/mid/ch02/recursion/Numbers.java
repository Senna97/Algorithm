package novice.mid.ch02.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {

    public void printNum(int num) {
        if (num == 0) {
            return;
        }

        printNum(num - 1);
        System.out.printf("%d ", num);
    }

    public void printNumReverse(int num) {
        if (num == 0) {
            return;
        }

        System.out.printf("%d ", num);
        printNumReverse(num - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Numbers numbers = new Numbers();
        numbers.printNum(N);
        System.out.println();
        numbers.printNumReverse(N);
    }
}
