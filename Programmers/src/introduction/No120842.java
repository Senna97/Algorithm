package introduction;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 입문 > 2차원으로 만들기
public class No120842 {

    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        int index = 0;

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                answer[i][j] = num_list[index];
                index++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120842 no120842 = new No120842();
        int[][] solution = no120842.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2);
        System.out.println(Arrays.deepToString(solution));
    }
}
