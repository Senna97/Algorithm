package introduction;

// 프로그래머스 > 코딩테스트 입문 > 문자열 계산하기
public class No120902 {

    public int solution(String my_string) {

        String[] split = my_string.split(" ");
        int answer = Integer.parseInt(split[0]);

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("+")) {
                answer += Integer.parseInt(split[i + 1]);
            } else if (split[i].equals("-")) {
                answer -= Integer.parseInt(split[i + 1]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120902 no120902 = new No120902();
        int solution = no120902.solution("3 + 4");
        System.out.println(solution);
    }
}
