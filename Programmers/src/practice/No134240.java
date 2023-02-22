package practice;

// 프로그래머스 > 연습문제 > 푸드 파이트 대회
public class No134240 {

    public String solution(int[] food) {

        StringBuilder sb = new StringBuilder();
        int[] count = new int[food.length];

        for (int i = 0; i < food.length; i++) {
            count[i] = food[i] / 2;
        }

        for (int i = 1; i < count.length; i++) {
            sb.append(String.valueOf(i).repeat(count[i]));
        }

        StringBuilder originSb = new StringBuilder(sb);

        sb.reverse();

        return String.valueOf(originSb.append(0).append(sb));
    }

    public static void main(String[] args) {
        No134240 no134240 = new No134240();
        String solution = no134240.solution(new int[]{1, 3, 4, 6});
        System.out.println(solution);
    }
}