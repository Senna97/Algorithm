package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 문자열의 앞의 n글자
public class No181907 {

    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            answer.append(my_string.charAt(i));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        No181907 no181907 = new No181907();
        String solution = no181907.solution("ProgrammerS123", 11);
        System.out.println(solution);
    }
}
