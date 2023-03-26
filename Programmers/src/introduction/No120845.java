package introduction;

// 프로그래머스 > 코딩테스트 입문 > 주사위의 개수
public class No120845 {

    public int solution(int[] box, int n) {
        int answer = 1;

        for (int i : box) {
            answer *= (i / n);
        }

        return answer;
    }

    public static void main(String[] args) {
        No120845 no120845 = new No120845();
        int solution = no120845.solution(new int[]{10, 8, 6}, 3);
        System.out.println(solution);
    }
}
