package practice;

// 프로그래머스 > 연습문제 > JadenCase 문자열 만들기
public class No12951 {

    public String solution(String s) {
        s = s.toLowerCase();

        String[] split = s.split("");
        split[0] = split[0].toUpperCase();

        for (int i = 1; i < split.length; i++) {
            if (split[i - 1].equals(" ")) {
                split[i] = split[i].toUpperCase();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            sb.append(split[i]);
        }

        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        No12951 no12951 = new No12951();
        String solution1 = no12951.solution("3people unFollowed me");
        System.out.println(solution1);
        String solution2 = no12951.solution("for the last week");
        System.out.println(solution2);
    }
}