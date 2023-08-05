package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 문자열 뒤집기
public class No181905 {

    public String solution(String my_string, int s, int e) {

        if (s == e) {
            return my_string;
        } else {
            StringBuilder answer = new StringBuilder();

            String[] split = my_string.split("");

            for (int i = 0; i < s; i++) {
                answer.append(split[i]);
            }

            for (int i = e; i >= s; i--) {
                answer.append(split[i]);
            }

            for (int i = e + 1; i < split.length; i++) {
                answer.append(split[i]);
            }

            return answer.toString();
        }

    }

    public static void main(String[] args) {
        No181905 no181905 = new No181905();
        String solution = no181905.solution("Progra21Sremm3", 6, 12);
        System.out.println(solution);
    }
}
