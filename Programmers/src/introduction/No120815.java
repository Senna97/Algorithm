package introduction;

// 프로그래머스 > 코딩테스트 입문 > 피자 나눠 먹기 (2)
public class No120815 {

    public int solution(int n) {
        int answer = 0;

        int pizza = 6;

        while (true) {
            if (pizza % n == 0) {
                answer++;
                break;
            } else {
                pizza += 6;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120815 no120815 = new No120815();
        int solution = no120815.solution(10);
        System.out.println(solution);
    }
}
