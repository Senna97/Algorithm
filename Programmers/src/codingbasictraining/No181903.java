package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > qr code
public class No181903 {

    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                answer.append(code.charAt(i));
            }
        }

        return answer.toString();

    }

    public static void main(String[] args) {
        No181903 no181903 = new No181903();
        String solution = no181903.solution(3, 1, "qjnwezgrpirldywt");
        System.out.println(solution);
    }
}
