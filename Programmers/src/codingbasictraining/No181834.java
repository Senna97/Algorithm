package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > l로 만들기
public class No181834 {

    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) >= 'l') {
                answer.append(myString.charAt(i));
            } else {
                answer.append('l');
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        No181834 no181834 = new No181834();
        String solution = no181834.solution("abcdevwxyz");
        System.out.println(solution);
    }
}
