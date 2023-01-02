package greedy;

import java.util.Arrays;

// 프로그래머스 > 탐욕법(Greedy) > 구명보트
public class No42885 {

    public int solution(int[] people, int limit) {
        int originLimit = limit;
        Arrays.sort(people);

        if (people[0] * 2 > limit) {
            return people.length;
        } else {
            int count = 0;
            int index = 0;
            while (index < people.length) {

                if (limit >= people[index]) {
                    limit -= people[index];
                    index++;
                } else {
                    limit = originLimit;
                    count++;
                }
            }

            if (people[people.length - 1] > limit) {
                return count + 1;
            } else {
                return count;
            }
        }
    }

    public static void main(String[] args) {
        No42885 no42885 = new No42885();
        int solution1 = no42885.solution(new int[]{40, 40, 40, 40, 40, 40}, 240);
        System.out.println(solution1);
        int solution2 = no42885.solution(new int[]{70, 80, 50}, 100);
        System.out.println(solution2);
    }
}