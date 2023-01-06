package greedy;

import java.util.*;

// 프로그래머스 > 탐욕법(Greedy) > 구명보트
public class No42885 {

    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);
        Deque<Integer> deque = new ArrayDeque<>();
        for (int person : people) {
            deque.addLast(person);
        }

        while (deque.size() > 0) {
            if (deque.getFirst() + deque.getLast() <= limit) {
                answer++;
                deque.pollFirst();
                deque.pollLast();
            } else {
                answer++;
                deque.pollLast();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No42885 no42885 = new No42885();
        int solution1 = no42885.solution(new int[]{30, 40, 50, 60}, 100);
        System.out.println(solution1);
        int solution2 = no42885.solution(new int[]{40, 40, 40, 40, 40, 40}, 240);
        System.out.println(solution2);
    }
}