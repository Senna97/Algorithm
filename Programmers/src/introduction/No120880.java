package introduction;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 입문 > 문자열 밀기
public class No120880 {

    public int[] solution(int[] numlist, int n) {
        int length = numlist.length;
        Arrays.sort(numlist);

        int[] diff = new int[length];
        int[] sortedDiff = new int[length];
        for (int i = 0; i < length; i++) {
            if (numlist[i] >= n) {
                diff[i] = numlist[i] - n;
                sortedDiff[i] = numlist[i] - n;

            } else {
                diff[i] = n - numlist[i];
                sortedDiff[i] = n - numlist[i];

            }
        }

        Arrays.sort(sortedDiff);

        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j >= 0; j--) {
                if (sortedDiff[i] == diff[j]) {
                    answer[i] = numlist[j];
                    diff[j] = -1;

                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120880 no120880 = new No120880();
        int[] solution = no120880.solution(new int[]{1, 2, 3, 4, 5, 6}, 4);
        System.out.println(Arrays.toString(solution));
    }
}
