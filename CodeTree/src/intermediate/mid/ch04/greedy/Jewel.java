package intermediate.mid.ch04.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Jewel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] weight = new int[N];
        int[] value = new int[N];
        for (int i = 0; i < N; i++) {
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }

        float[] cost = new float[N];
        for (int i = 0; i < N; i++) {
            cost[i] = (float) value[i] / weight[i];
        }

        System.out.println(Arrays.toString(cost));

        float max = 0;
        for (int i = 0; i < cost.length; i++) {
            max = Math.max(max, cost[i]);
        }
        System.out.println(max);
    }
}
