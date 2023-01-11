package sorting;

import java.util.Arrays;
import java.util.Collections;

// 프로그래머스 > 정렬 > H-Index
public class No42747 {

    public int solution(int[] citations) {

        Integer[] nums = new Integer[citations.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = citations[i];
        }
        Arrays.sort(nums, Collections.reverseOrder());

        int[] index = new int[nums.length];
        for (int i = 0; i < index.length; i++) {
            index[i] = i + 1;
        }

        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                break;
            }

            if (nums[nums.length - 1] > index[index.length - 1]) {
                answer = nums.length;
                break;
            }

            if (nums[i] < index[i]) {
                answer = index[i - 1];
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No42747 no42747 = new No42747();
        int solution = no42747.solution(new int[]{0, 0, 0, 0, 0});
        System.out.println(solution);
    }
}