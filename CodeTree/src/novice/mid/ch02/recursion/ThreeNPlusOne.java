package novice.mid.ch02.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeNPlusOne {

    public int countWhenOne(int num, int count) {

        if (num == 1) {
            return count;
        }

        if (num % 2 == 0) {
            return countWhenOne(num / 2, count+=1);
        } else {
            return countWhenOne(num * 3 + 1, count+=1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ThreeNPlusOne threeNPlusOne = new ThreeNPlusOne();
        int answer = threeNPlusOne.countWhenOne(n, 0);
        System.out.println(answer);
    }
}
