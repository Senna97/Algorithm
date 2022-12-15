package practice;

public class No12948 {

    public String solution(String phone_number) {

        int len = phone_number.length();
        String substring = phone_number.substring(len - 4, len);

        String star = "*";
        String repeat = star.repeat(len - 4);

        String answer = repeat + substring;
        return answer;
    }

    public static void main(String[] args) {
        No12948 no12948 = new No12948();
        String solution = no12948.solution("01033334444");
        System.out.println(solution);
    }
}
