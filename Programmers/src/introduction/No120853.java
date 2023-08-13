package introduction;

// 프로그래머스 > 코딩테스트 입문 > 컨트롤 제트
public class No120853 {

    public int solution(String s) {
        int answer = 0;
        String[] split = s.split(" ");

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("Z")) {
                answer -= Integer.parseInt(split[i - 1]);
            } else {
                answer += Integer.parseInt(split[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120853 no120853 = new No120853();
        int solution = no120853.solution("1 2 Z 3");
        System.out.println(solution);
    }
}
