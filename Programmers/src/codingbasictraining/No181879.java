package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 길이에 따른 연산
public class No181879 {

    public int solution(int[] num_list) {

        int sum = 0;
        int multiple = 1;

        if (num_list.length >= 11) {
            for (int num : num_list) {
                sum += num;
            }
            return sum;
        } else {
            for (int num : num_list) {
                multiple *= num;
            }
            return multiple;
        }

    }

    public static void main(String[] args) {
        No181879 no181879 = new No181879();
        int solution = no181879.solution(new int[]{3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1});
        System.out.println(solution);
    }
}
