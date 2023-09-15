package introduction;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 입문 > 캐릭터의 좌표
public class No120861 {

    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int limitX = board[0] / 2;
        int limitY = board[1] / 2;

        for (String direction : keyinput) {
            switch (direction) {
                case "up":
                    if (answer[1] >= limitY || answer[1] < limitY * -1) {
                        continue;
                    } else {
                        answer[1] = answer[1] + 1;
                    }
                    break;
                case "down":
                    if (answer[1] > limitY || answer[1] <= limitY * -1) {
                        continue;
                    } else {
                        answer[1] = answer[1] - 1;
                    }
                    break;
                case "left":
                    if (answer[0] > limitX || answer[0] <= limitX * -1) {
                        continue;
                    } else {
                        answer[0] = answer[0] - 1;
                    }
                    break;
                case "right":
                    if (answer[0] >= limitX || answer[0] < limitX * -1) {
                        continue;
                    } else {
                        answer[0] = answer[0] + 1;
                    }
                    break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120861 no120861 = new No120861();
        int[] solution = no120861.solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11});
        System.out.println(Arrays.toString(solution));
    }
}
