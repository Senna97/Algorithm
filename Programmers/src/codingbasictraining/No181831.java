package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 특별한 이차원 배열 2
public class No181831 {

    public int solution(int[][] arr) {
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == arr[j][i]) {
                    answer = 1;
                } else {
                    return 0;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No181831 no181831 = new No181831();
        int solution = no181831.solution(new int[][]{{5, 192, 33}, {192, 72, 95}, {33, 95, 999}});
        System.out.println(solution);
    }
}
