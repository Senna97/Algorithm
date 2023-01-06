package practice;

// 프로그래머스 > 연습문제 > N개의 최소공배수
public class No12953 {

    public int solution(int[] arr) {
        int answer = 1;
        for (int i : arr) {
            answer *= i / getGCD(answer, i);
        }
        return answer;
    }

    public int getGCD(int a, int b) {

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        if (max % min == 0) {
            return min;
        }
        return getGCD(max % min, min);
    }

    public static void main(String[] args) {
        No12953 no12953 = new No12953();
        int solution1 = no12953.solution(new int[]{6, 12});
        System.out.println(solution1);
        int solution2 = no12953.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(solution2);
    }
}