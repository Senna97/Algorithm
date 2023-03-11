package introduction;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 입문 > 삼각형의 완성조건 (1)
public class No120889 {

    public int solution(int[] sides) {
        Arrays.sort(sides);

        if (sides[2] < sides[0] + sides[1]) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        No120889 no120889 = new No120889();
        int solution = no120889.solution(new int[]{1, 2, 3});
        System.out.println(solution);
    }
}
