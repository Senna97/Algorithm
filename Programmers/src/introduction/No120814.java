package introduction;

// 프로그래머스 > 코딩테스트 입문 > 피자 나눠 먹기 (1)
public class No120814 {

    public int solution(int n) {
        if (n % 7 == 1) {
            return n / 7;
        }
        return n / 7 + 1;
    }

    public static void main(String[] args) {
        No120814 no120814 = new No120814();
        int solution = no120814.solution(7);
        System.out.println(solution);
    }
}
