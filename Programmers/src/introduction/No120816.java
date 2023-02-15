package introduction;

// 프로그래머스 > 코딩테스트 입문 > 피자 나눠 먹기 (3)
public class No120816 {

    public int solution(int slice, int n) {

        if (n % slice == 0) {
            return n / slice;
        } else {
            return n / slice + 1;
        }

    }

    public static void main(String[] args) {
        No120816 no120816 = new No120816();
        int solution = no120816.solution(7, 10);
        System.out.println(solution);
    }
}
