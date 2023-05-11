package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 정수 찾기
public class No181840 {

    public int solution(int[] num_list, int n) {
        int answer = 0;

        int index = 0;
        while (num_list.length > index) {

            if (num_list[index] == n) {
                answer = 1;
                break;
            } else {
                index++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No181840 no181840 = new No181840();
        int solution = no181840.solution(new int[]{1, 2, 3, 4, 5}, 6);
        System.out.println(solution);
    }
}
