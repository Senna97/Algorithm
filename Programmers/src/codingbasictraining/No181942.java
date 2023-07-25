package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 문자열 섞기
public class No181942 {

    public String solution(String str1, String str2) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            answer.append(str1.charAt(i));
            answer.append(str2.charAt(i));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        No181942 no181942 = new No181942();
        String solution = no181942.solution("aaaaa", "bbbbb");
        System.out.println(solution);
    }
}
