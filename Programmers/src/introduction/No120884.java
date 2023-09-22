package introduction;

// 프로그래머스 > 코딩테스트 입문 > 치킨 쿠폰
public class No120884 {

    public int solution(int chicken) {
        int answer = 0;

        while (chicken >= 10) {
            answer += chicken / 10;
            chicken = (chicken / 10 + chicken % 10);
        }

        return answer;
    }

    public static void main(String[] args) {
        No120884 no120884 = new No120884();
        int solution = no120884.solution(100);
        System.out.println(solution);
    }
}
