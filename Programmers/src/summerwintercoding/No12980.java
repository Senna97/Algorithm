package summerwintercoding;

// 프로그래머스 > Summer/Winter Coding(~2018) > 점프와 순간 이동
public class No12980 {

    public int solution(int n) {
        int ans = 1;

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;

            } else {
                n -= 1;
                ans += 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        No12980 no12980 = new No12980();
        int solution = no12980.solution(5000);
        System.out.println(solution);
    }
}