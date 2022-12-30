package monthlycodechallengeseason1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 프로그래머스 > 월간 코드 챌린지 시즌1 > 두 개 뽑아서 더하기
public class No68644 {
    public int[] solution(int[] numbers) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        Integer[] arr = set.toArray(new Integer[0]);
        Arrays.sort(arr);
        return Arrays.stream(arr).mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        No68644 no68644 = new No68644();
        int[] solution = no68644.solution(new int[]{2, 1, 3, 4, 1});
        System.out.println(Arrays.toString(solution));
    }
}
