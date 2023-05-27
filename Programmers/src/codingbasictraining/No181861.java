package codingbasictraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 코딩 기초 트레이닝 > 배열의 원소만큼 추가하기
public class No181861 {

    public int[] solution(int[] arr) {

        int length = 0;
        for (int count : arr) {
            length += count;
        }

        int[] answer = new int[length];

        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            for (int j = 0; j < i; j++) {
                list.add(i);
            }
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        No181861 no181861 = new No181861();
        int[] solution = no181861.solution(new int[]{5, 1, 4});
        System.out.println(Arrays.toString(solution));
    }

}
