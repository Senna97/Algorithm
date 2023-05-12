package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > n보다 커질 때까지 더하기
public class No181884 {

    public int solution(int[] numbers, int n) {
        int answer = 0;

        int index = 0;
        while (answer <= n) {

            answer += numbers[index];
            index++;
        }

        return answer;
    }

    public static void main(String[] args) {
        No181884 no181884 = new No181884();
        int solution = no181884.solution(new int[]{34, 5, 71, 29, 100, 34}, 123);
        System.out.println(solution);
    }
}
