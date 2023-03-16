package introduction;

// 프로그래머스 > 코딩테스트 입문 > 자릿수 더하기
public class No120906 {

    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        No120906 no120906 = new No120906();
        int solution = no120906.solution(1234);
        System.out.println(solution);
    }
}
