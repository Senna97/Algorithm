package introduction;


// 프로그래머스 > 코딩테스트 입문 > 외계행성의 나이
public class No120834 {

    public String solution(int age) {
        StringBuilder answer = new StringBuilder();

        String strAge = String.valueOf(age);
        for (int i = 0; i < strAge.length(); i++) {
            answer.append((char) (Integer.parseInt(String.valueOf(strAge.charAt(i))) + 97));
        }

        return String.valueOf(answer);
    }

    public static void main(String[] args) {
        No120834 no120834 = new No120834();
        String solution = no120834.solution(23);
        System.out.println(solution);
    }
}
