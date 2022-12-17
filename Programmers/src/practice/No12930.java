package practice;

// 프로그래머스 > 연습문제 > 이상한 문자 만들기
public class No12930 {

    public String solution(String s) {

        s = s.toLowerCase();
        String[] split = s.split("");

        int index = 0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(" ")) {
                index = 0;
            } else if (index % 2 == 0) {
                split[i] = split[i].toUpperCase();
                index++;
            } else {
                index++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String str : split) {
            sb.append(str);
        }

        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        No12930 no12930 = new No12930();
        String solution = no12930.solution("  try hello world");
        System.out.println(solution);
    }
}
