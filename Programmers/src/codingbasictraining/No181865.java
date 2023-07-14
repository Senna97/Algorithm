package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 간단한 식 계산하기
public class No181865 {

    public int solution(String binomial) {
        int answer = 0;

        String[] split = binomial.split(" ");

        int first = Integer.parseInt(split[0]);
        int second = Integer.parseInt(split[2]);

        String arithmetic = split[1];

        switch (arithmetic) {
            case "+":
                answer = first + second;
                break;
            case "-":
                answer = first - second;
                break;
            case "*":
                answer = first * second;
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        No181865 no181865 = new No181865();
        int solution = no181865.solution("43 + 12");
        System.out.println(solution);
    }
}
