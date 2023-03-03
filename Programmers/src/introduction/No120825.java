package introduction;

// 프로그래머스 > 코딩테스트 입문 > 문자 반복 출력하기
public class No120825 {

    public String solution(String my_string, int n) {
        String[] split = my_string.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(split[i]);
            }
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        No120825 no120825 = new No120825();
        String hello = no120825.solution("hello", 3);
        System.out.println(hello);
    }
}
