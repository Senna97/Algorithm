package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 가까운 1 찾기
public class No181898 {

    public int solution(int[] arr, int idx) {
        int answer = -1;

        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No181898 no181898 = new No181898();
        int solution = no181898.solution(new int[]{0, 0, 0, 1}, 1);
        System.out.println(solution);
    }
}
