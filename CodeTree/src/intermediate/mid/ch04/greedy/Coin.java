package intermediate.mid.ch04.greedy;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] coins = new int[n];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = sc.nextInt();
        }

        int answer = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            answer += k / coins[i];
            k = k % coins[i];
        }
        System.out.println(answer);
    }
}
