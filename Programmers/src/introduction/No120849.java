package introduction;

// 프로그래머스 > 코딩테스트 입문 > 모음 제거
public class No120849 {

    public String solution(String my_string) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != 'a' && my_string.charAt(i) != 'e' && my_string.charAt(i) != 'i' && my_string.charAt(i) != 'o' && my_string.charAt(i) != 'u') {
                sb.append(my_string.charAt(i));
            }
        }

        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        No120849 no120849 = new No120849();
        String solution = no120849.solution("bus");
        System.out.println(solution);
    }
}
