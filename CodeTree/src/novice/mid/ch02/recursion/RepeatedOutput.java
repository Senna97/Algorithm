package novice.mid.ch02.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatedOutput {


    public void printHelloWorld(int num) {
        if (num == 0) {
            return;
        }
        System.out.println("HelloWorld");
        printHelloWorld(num - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        RepeatedOutput repeatedOutput = new RepeatedOutput();
        repeatedOutput.printHelloWorld(N);

    }
}
