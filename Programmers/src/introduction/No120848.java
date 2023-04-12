package introduction;

// 프로그래머스 > 코딩테스트 입문 > 팩토리얼
public class No120848 {

    public int solution(int n) {

        int multiple = 2;
        int result = 1;

        while (true) {

            result *= multiple;
            if (result == n) {
                break;
            } else if (result > n) {
                multiple--;
                break;
            }

            multiple++;

        }

        return multiple;
    }

    public static void main(String[] args) {
        No120848 no120848 = new No120848();
        int solution = no120848.solution(7);
        System.out.println(solution);
    }
}
