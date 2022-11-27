package novice.mid.ch02.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BigSum {

    public int getSum(int num) {
        if (num / 10 == 0) {
            return num % 10;
        }
        return getSum(num / 10) + num % 10;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        BigSum bigSum = new BigSum();
        int answer = bigSum.getSum(a * b * c);
        System.out.println(answer);
    }
}
