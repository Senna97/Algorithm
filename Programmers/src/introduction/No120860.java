package introduction;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 입문 > 직사각형 넓이 구하기
public class No120860 {

    public int solution(int[][] dots) {
        int width;
        int height;

        int[] widths = new int[dots.length];
        int[] heights = new int[dots.length];

        for (int i = 0; i < dots.length; i++) {
            widths[i] = dots[i][0];
            heights[i] = dots[i][1];
        }

        Arrays.sort(widths);
        Arrays.sort(heights);

        width = widths[3] - widths[0];
        height = heights[3] - heights[0];

        return width * height;
    }

    public static void main(String[] args) {
        No120860 no120860 = new No120860();
        int solution = no120860.solution(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}});
        System.out.println(solution);
    }
}
