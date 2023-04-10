package introduction;

// 프로그래머스 > 코딩테스트 입문 > 모스부호 (1)
public class No120838 {

    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

        String[] split = letter.split(" ");

        for (String str : split) {
            for (int j = 0; j < morse.length; j++) {
                if (str.equals(morse[j])) {
                    answer.append((char) (j + 97));
                }
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        No120838 no120838 = new No120838();
        String solution = no120838.solution(".... . .-.. .-.. ---");
        System.out.println(solution);
    }
}
