package introduction;

// 프로그래머스 > 코딩테스트 입문 > 숨어있는 숫자의 덧셈 (1)
public class No120851 {

    public int solution(String my_string) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            if (!(my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z') && !(my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z')) {
                answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120851 no120851 = new No120851();
        int answer = no120851.solution("aAb1B2cC34oOp");
        System.out.println(answer);
    }
}
