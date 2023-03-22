package introduction;

// 프로그래머스 > 코딩테스트 입문 > 가위 바위 보
public class No120839 {

    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < rsp.length(); i++) {
            switch (rsp.charAt(i)) {
                case '2':
                    answer.append("0");
                    break;
                case '0':
                    answer.append("5");
                    break;
                case '5':
                    answer.append("2");
                    break;
            }
        }

        return String.valueOf(answer);
    }

    public static void main(String[] args) {
        No120839 no120839 = new No120839();
        String solution = no120839.solution("2");
        System.out.println(solution);
    }
}
