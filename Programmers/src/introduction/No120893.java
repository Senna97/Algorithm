package introduction;

// 프로그래머스 > 코딩테스트 입문 > 대문자와 소문자
public class No120893 {

    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z') {
                answer.append(String.valueOf(my_string.charAt(i)).toUpperCase());
            } else if (my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z') {
                answer.append(String.valueOf(my_string.charAt(i)).toLowerCase());
            }
        }

        return String.valueOf(answer);
    }

    public static void main(String[] args) {
        No120893 no120893 = new No120893();
        String solution = no120893.solution("cccCCC");
        System.out.println(solution);
    }
}
