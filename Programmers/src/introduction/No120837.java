package introduction;

// 프로그래머스 > 코딩테스트 입문 > 개미 군단
public class No120837 {

    public int solution(int hp) {
        int answer = 0;

        while (hp >= 5) {
            hp -= 5;
            answer += 1;
        }

        while (hp >= 3) {
            hp -= 3;
            answer += 1;
        }

        while (hp >= 1) {
            hp -= 1;
            answer += 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        No120837 no120837 = new No120837();
        int solution = no120837.solution(23);
        System.out.println(solution);
    }
}
