package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 문자열 겹쳐쓰기
public class No181943 {

    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder answer = new StringBuilder();

        answer.append(my_string.substring(0, s));
        answer.append(overwrite_string);
        answer.append(my_string.substring(answer.length()));

        return answer.toString();
    }

    public static void main(String[] args) {
        No181943 no181943 = new No181943();
        String solution = no181943.solution("He11oWor1d", "lloWorl", 2);
        System.out.println(solution);
    }
}
