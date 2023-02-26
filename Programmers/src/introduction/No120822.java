package introduction;

// 프로그래머스 > 코딩테스트 입문 > 문자열 뒤집기
public class No120822 {

    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (int i = my_string.length()-1; i >=0 ; i--) {
            sb.append(my_string.charAt(i));
        }

        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        No120822 no120822 = new No120822();
        String str = no120822.solution("jaron");
        System.out.println(str);
    }
}
