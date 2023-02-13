package introduction;
// 프로그래머스 > 코딩테스트 입문 > 점의 위치 구하기
public class No120841 {

    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];

        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args) {
        No120841 no120841 = new No120841();
        int solution = no120841.solution(new int[]{2, 4});
        System.out.println(solution);
    }
}
