package practice;

// 프로그래머스 > 연습문제 > 문자열 다루기 기본
public class No12918 {

    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            String numbers = "1234567890";

            String[] split = s.split("");
            int count = 0;
            for (String str : split) {
                if (numbers.contains(str)) {
                    count++;
                }
            }

            return count == s.length();
        }
        return false;

    }

    public static void main(String[] args) {
        No12918 no12918 = new No12918();
        boolean solution = no12918.solution("a000");
        System.out.println(solution);
    }
}
