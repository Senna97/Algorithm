package codingbasictraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 코딩 기초 트레이닝 > 리스트 자르기
public class No181897 {

    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};

        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        switch (n) {
            case 1:
                answer = slice(num_list, 0, b, 0);
                break;
            case 2:
                answer = slice(num_list, a, num_list.length - 1, 0);
                break;
            case 3:
                answer = slice(num_list, a, b, 0);
                break;
            case 4:
                answer = slice(num_list, a, b, c);
                break;
        }

        return answer;
    }

    public int[] slice(int[] numList, int x, int y, int z) {

        List<Integer> list = new ArrayList<>();
        if (z != 0) {
            for (int i = x; i <= y; i += z) {
                list.add(numList[i]);
            }
        } else {
            for (int i = x; i <= y; i++) {
                list.add(numList[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        No181897 no181897 = new No181897();
        int[] solution = no181897.solution(4, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println(Arrays.toString(solution));
    }
}
