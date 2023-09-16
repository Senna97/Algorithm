package introduction;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 입문 > 등수 매기기
public class No120882 {

    public int[] solution(int[][] score) {

        int length = score.length;
        double[] averageScore = new double[length];
        double[] sortedAverageScore = new double[length];

        for (int i = 0; i < length; i++) {
            int englishScore = score[i][0];
            int mathScore = score[i][1];

            averageScore[i] = (englishScore + mathScore) / 2.0;
            sortedAverageScore[i] = (englishScore + mathScore) / 2.0;
        }

        Arrays.sort(sortedAverageScore);

        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (averageScore[i] == sortedAverageScore[j]) {
                    answer[i] = length - j;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120882 no120882 = new No120882();
        int[] solution = no120882.solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}});
        System.out.println(Arrays.toString(solution));
    }
}
