package novice.mid.ch02.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrangeArray {

    public int printNum(int index) {
        if (index == 1) {
            return 1;
        } else if (index == 2) {
            return 2;
        }

        return printNum(index / 3) + printNum(index - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StrangeArray strangeArray = new StrangeArray();
        int answer = strangeArray.printNum(N);
        System.out.println(answer);
    }
}
