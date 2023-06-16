package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 원하는 문자열 찾기
public class No181878 {

    public int solution(String myString, String pat) {

        String myStringLowerCase = myString.toLowerCase();
        String patLowerCase = pat.toLowerCase();

        if (myStringLowerCase.contains(patLowerCase)) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        No181878 no181878 = new No181878();
        int solution = no181878.solution("AbCdEfG", "aBc");
        System.out.println(solution);
    }
}
