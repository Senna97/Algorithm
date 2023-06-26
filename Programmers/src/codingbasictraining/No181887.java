package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 홀수 vs 짝수
public class No181887 {

    public int solution(int[] num_list) {

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                oddSum += num_list[i];
            } else {
                evenSum += num_list[i];
            }
        }

        return Math.max(oddSum, evenSum);

    }

    public static void main(String[] args) {
        No181887 no181887 = new No181887();
        int solution = no181887.solution(new int[]{4, 2, 6, 1, 7, 6});
        System.out.println(solution);
    }
}
