package introduction;

// 프로그래머스 > 코딩테스트 입문 > 구슬을 나누는 경우의 수
public class No120840 {

    public int solution(int balls, int share) {
        long answer = 1;

        for (long i = 0; i < share; i++) {
            answer = answer * (balls - i) / (i + 1);
        }

        return (int) answer;
    }

    public static void main(String[] args) {
        No120840 no120840 = new No120840();
        int solution = no120840.solution(3, 2);
        System.out.println(solution);
    }
}
