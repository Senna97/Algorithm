package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > A 강조하기
public class No181874 {

    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();

        String newMyString = myString.toLowerCase();
        String[] chars = newMyString.split("");

        for (String c : chars) {
            if (c.equals("a")) {
                answer.append(c.toUpperCase());
            } else {
                answer.append(c.toLowerCase());
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        No181874 no181874 = new No181874();
        String solution = no181874.solution("abstract algebra");
        System.out.println(solution);
    }
}
