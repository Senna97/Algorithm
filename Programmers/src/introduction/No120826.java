package introduction;

// 프로그래머스 > 코딩테스트 입문 > 특정 문자 제거하기
public class No120826 {

    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != letter.charAt(0)) {
                sb.append(my_string.charAt(i));
            }
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        No120826 no120826 = new No120826();
        String solution = no120826.solution("abcdef", "f");
        System.out.println(solution);
    }
}
