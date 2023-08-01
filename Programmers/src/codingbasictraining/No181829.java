package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 이차원 배열 대각선 순회하기
public class No181829 {

    public int solution(int[][] board, int k) {
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) {
                    answer += board[i][j];
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No181829 no181829 = new No181829();
        int solution = no181829.solution(new int[][]{{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}}, 2);
        System.out.println(solution);
    }
}
