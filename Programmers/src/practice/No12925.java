package practice;

// 프로그래머스 > 연습문제 > 문자열을 정수로 바꾸기
public class No12925 {

    public int solution(String s) {
        int answer = 0;

        if (s.charAt(0) == '-') {
            s = s.substring(1);
            answer = Integer.parseInt(s) * -1;
        } else {
            answer = Integer.parseInt(s);
        }


        return answer;
    }

    public static void main(String[] args) {
        No12925 no12925 = new No12925();
        int solution1 = no12925.solution("+1234");
        System.out.println(solution1);
        int solution2 = no12925.solution("-1234");
        System.out.println(solution2);
    }
}
