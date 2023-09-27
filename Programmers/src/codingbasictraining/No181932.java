package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 코드 처리하기
public class No181932 {

    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1' && mode == 0) {
                mode = 1;
            } else if (code.charAt(i) == '1' && mode == 1) {
                mode = 0;
            } else {
                if (mode == 0 && i % 2 == 0) {
                    answer.append(code.charAt(i));
                } else if (mode == 1 && i % 2 == 1) {
                    answer.append(code.charAt(i));
                }
            }
        }

        if (answer.length() == 0) {
            return "EMPTY";
        } else {
            return answer.toString();
        }
    }

    public static void main(String[] args) {
        No181932 no181932 = new No181932();
        String solution = no181932.solution("abc1abc1abc");
        System.out.println(solution);
    }
}
