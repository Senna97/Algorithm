package introduction;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 입문 > 아이스 아메리카노
public class No120819 {

    public int[] solution(int money) {
        int[] answer = new int[2];

        answer[0] = money / 5500;
        answer[1] = money % 5500;

        return answer;
    }

    public static void main(String[] args) {
        No120819 no120819 = new No120819();
        int[] solution = no120819.solution(5500);
        System.out.println(Arrays.toString(solution));
    }
}
