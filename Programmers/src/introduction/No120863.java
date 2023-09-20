package introduction;

// 프로그래머스 > 코딩테스트 입문 > 다항식 더하기
public class No120863 {

    public String solution(String polynomial) {
        String[] terms = polynomial.split("\\+");

        for (int i = 0; i < terms.length; i++) {
            terms[i] = terms[i].trim();
        }

        int coefficient = 0;
        int constant = 0;
        for (int i = 0; i < terms.length; i++) {
            if (terms[i].contains("x")) {
                terms[i] = terms[i].substring(0, terms[i].length() - 1);
                if (terms[i].equals("")) {
                    coefficient++;
                } else {
                    coefficient += Integer.parseInt(terms[i]);
                }
            } else {
                constant += Integer.parseInt(terms[i]);
            }
        }

        String answer;

        if (coefficient == 0) {
            answer = String.valueOf(constant);
        } else if (constant == 0) {
            if (coefficient == 1) {
                answer = "x";

            } else {
                answer = coefficient + "x";
            }

        } else {
            if (coefficient == 1) {
                answer = "x + " + constant;

            } else {
                answer = coefficient + "x + " + constant;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120863 no120863 = new No120863();
        String solution = no120863.solution("3x + 7 + x");
        System.out.println(solution);
    }
}
