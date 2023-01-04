package bruteforce;

import java.util.Arrays;

// 프로그래머스 > 완전탐색 > 최소직사각형
public class No86491 {

    public int solution(int[][] sizes) {

        int[] widths = new int[sizes.length];
        for (int i = 0; i < sizes.length; i++) {
            widths[i] = sizes[i][0];
        }

        int[] heights = new int[sizes.length];
        for (int i = 0; i < sizes.length; i++) {
            heights[i] = sizes[i][1];
        }

        for (int i = 0; i < widths.length; i++) {
            if (heights[i] > widths[i]) {
                int temp;
                temp = widths[i];
                widths[i] = heights[i];
                heights[i] = temp;
            }
        }

        Arrays.sort(widths);
        Arrays.sort(heights);

        return widths[widths.length - 1] * heights[heights.length - 1];
    }

    public static void main(String[] args) {
        No86491 no86491 = new No86491();
        int solution = no86491.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
        System.out.println(solution);
    }
}
