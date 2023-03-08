package introduction;

// 프로그래머스 > 코딩테스트 입문 > 중복된 숫자 개수
public class No120583 {
    public int solution(int[] array, int n) {
        int answer = 0;

        for (int i : array) {
            if (i == n) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120583 no120583 = new No120583();
        int solution = no120583.solution(new int[]{1, 1, 2, 3, 4, 5}, 1);
        System.out.println(solution);
    }
}
