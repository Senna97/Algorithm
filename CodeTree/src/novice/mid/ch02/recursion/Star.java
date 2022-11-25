package novice.mid.ch02.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star {

    public String printStar(int num) {
        if (num == 0) {
            return "";
        }

        return printStar(num - 1) + "*";
    }

    public void printLine(int num) {
        if (num == 0) {
            return;
        }

        printLine(num - 1);
        System.out.println(printStar(num));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Star star = new Star();
        star.printLine(n);
    }
}