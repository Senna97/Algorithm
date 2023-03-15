package introduction;

// 프로그래머스 > 코딩테스트 입문 > 편지
public class No120898 {

    public int solution(String message) {
        return message.length() * 2;
    }

    public static void main(String[] args) {
        No120898 no120898 = new No120898();
        int solution = no120898.solution("happy birthday!");
        System.out.println(solution);
    }
}
