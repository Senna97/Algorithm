package introduction;

// 프로그래머스 > 코딩테스트 입문 > 머쓱이보다 키 큰 사람
public class No120585 {

    public int solution(int[] array, int height) {
        int answer = 0;

        for (int i : array) {
            if (i > height) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120585 no120585 = new No120585();
        int solution = no120585.solution(new int[]{149, 180, 192, 170}, 167);
        System.out.println(solution);
    }
}
