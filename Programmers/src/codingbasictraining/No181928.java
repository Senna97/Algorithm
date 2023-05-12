package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 이어 붙인 수
public class No181928 {

    public int solution(int[] num_list) {

        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 == 0) {
                even.append(num);
            } else {
                odd.append(num);
            }
        }

        return Integer.parseInt(String.valueOf(odd)) + Integer.parseInt(String.valueOf(even));
    }

    public static void main(String[] args) {
        No181928 no181928 = new No181928();
        int solution = no181928.solution(new int[]{3, 4, 5, 2, 1});
        System.out.println(solution);
    }
}
