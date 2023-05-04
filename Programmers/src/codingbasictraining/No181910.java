package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 문자열의 뒤의 n글자
public class No181910 {

    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();

        int start = my_string.length() - n;

        for (int i = start; i < my_string.length(); i++) {
            answer.append(my_string.charAt(i));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        No181910 no181910 = new No181910();
        String solution = no181910.solution("ProgrammerS123", 11);
        System.out.println(solution);
    }
}
