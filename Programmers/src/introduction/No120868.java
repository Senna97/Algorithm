package introduction;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 입문 > 삼각형의 완성조건 (2)
public class No120868 {

    public int solution(int[] sides) {

        Arrays.sort(sides);

        int answer = 0; // 나머지 한 변이 될 수 있는 정수의 개수

        for (int i = sides[1] - sides[0] + 1; i <= sides[1]; i++) {
            answer++;
        }

        for (int i = sides[0] + sides[1] - 1; i > sides[1]; i--) {
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        No120868 no120868 = new No120868();
        int solution = no120868.solution(new int[]{1, 2});
        System.out.println(solution);
    }
}
