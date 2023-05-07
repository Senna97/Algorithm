package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 원소들의 곱과 합
public class No181929 {

    public int solution(int[] num_list) {

        int multiple = 1;
        int sum = 0;

        for (int num : num_list) {
            multiple *= num;
            sum += num;
        }

        if (multiple < sum * sum) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        No181929 no181929 = new No181929();
        int solution = no181929.solution(new int[]{3, 4, 5, 2, 1});
        System.out.println(solution);
    }
}
