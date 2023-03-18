package introduction;

// 프로그래머스 > 코딩테스트 입문 > 문자열안에 문자열
public class No120908 {

    public int solution(String str1, String str2) {

        if (str1.contains(str2)) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        No120908 no120908 = new No120908();
        int solution = no120908.solution("ab6CDE443fgh22iJKlmn1o", "6CD");
        System.out.println(solution);
    }
}
