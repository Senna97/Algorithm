package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 전국 대회 선발 고사
public class No181851 {

    public int solution(int[] rank, boolean[] attendance) {
        int[] originRank = new int[rank.length];

        for (int i = 0; i < rank.length; i++) {
            if (!attendance[i]) {
                rank[i] = 200;
            }
            originRank[i] = rank[i];
        }

        Arrays.sort(rank);

        int[] answerRank = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < originRank.length; j++) {
                if (rank[i] == originRank[j]) {
                    answerRank[i] = j;
                }
            }
        }

        int a = answerRank[0];
        int b = answerRank[1];
        int c = answerRank[2];

        return 10000 * a + 100 * b + c;
    }

    public static void main(String[] args) {
        No181851 no181851 = new No181851();
        int solution = no181851.solution(new int[]{3, 7, 2, 5, 4, 6, 1}, new boolean[]{false, true, true, true, true, false, false});
        System.out.println(solution);
    }
}
