package novice.mid.ch02.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LeastCommonMultiple {

    public int getGCD(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return getGCD(a - b, b);
        } else {
            return getGCD(a, b - a);
        }
    }

    public int getLCM(int[] arr) {
        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            temp = temp * arr[i + 1] / getGCD(temp, arr[i + 1]);
        }

        return temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        LeastCommonMultiple leastCommonMultiple = new LeastCommonMultiple();
        int lcm = leastCommonMultiple.getLCM(arr);
        System.out.println(lcm);
    }
}