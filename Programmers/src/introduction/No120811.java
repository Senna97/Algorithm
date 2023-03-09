package introduction;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 입문 > 중앙값 구하기
public class No120811 {

    public int solution(int[] array) {
        Arrays.sort(array);
        int index = array.length / 2;
        return array[index];
    }

    public static void main(String[] args) {
        No120811 no120811 = new No120811();
        int solution = no120811.solution(new int[]{1, 2, 7, 10, 11});
        System.out.println(solution);
    }
}
