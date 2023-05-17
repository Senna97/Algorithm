package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 첫 번째로 나오는 음수
public class No181896 {

    public int solution(int[] num_list) {
        int answer = -1;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No181896 no181896 = new No181896();
        int solution = no181896.solution(new int[]{12, 4, 15, 46, 38, -2, 15});
        System.out.println(solution);
    }
}
