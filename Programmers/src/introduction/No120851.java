package introduction;

// 프로그래머스 > 코딩테스트 입문 > 숨어있는 숫자의 덧셈 (1)
public class No120851 {

    public int solution(String my_string) {
        int answer = 0;
        int i = Integer.parseInt(my_string);
        System.out.println(i);
        return answer;
    }

    public static void main(String[] args) {
        No120851 no120851 = new No120851();
        int answer = no120851.solution("aAb1B2cC34oOp");
        System.out.println(answer);
    }
}
