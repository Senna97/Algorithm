package novice.mid.ch02.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Max {

    public int getMax(int[] arr, int length) {
        if (length == 0) {
            return arr[0];
        }

        return Math.max(getMax(arr, length - 1), arr[length]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int[] intArr = new int[n];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        Max max = new Max();
        int answer = max.getMax(intArr, intArr.length - 1);
        System.out.println(answer);
    }
}