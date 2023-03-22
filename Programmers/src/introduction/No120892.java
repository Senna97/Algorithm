package introduction;

// 프로그래머스 > 코딩테스트 입문 > 암호 해독
public class No120892 {

    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();


        for (int i = 0; i < cipher.length(); i++) {
            if (i % code == (code - 1)) {
                answer.append(cipher.charAt(i));
            }
        }

        return String.valueOf(answer);
    }

    public static void main(String[] args) {
        No120892 no120892 = new No120892();
        String solution = no120892.solution("dfjardstddetckdaccccdegk", 4);
        System.out.println(solution);
    }
}
