package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 등차수열의 특정한 항만 더하기
public class No181931 {

    public int solution(int a, int d, boolean[] included) {

        int[] sequence = new int[included.length];

        sequence[0] = a;
        for (int i = 1; i < sequence.length; i++) {
            sequence[i] = sequence[i - 1] + d;
        }

        int answer = 0;

        for (int i = 0; i < sequence.length; i++) {
            if (included[i]) {
                answer += sequence[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No181931 no181931 = new No181931();
        int solution = no181931.solution(3, 4, new boolean[]{true, false, false, true, true});
        System.out.println(solution);
    }
}
