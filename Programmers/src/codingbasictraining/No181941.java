package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 문자 리스트를 문자열로 변환하기
public class No181941 {

    public String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();

        for (String str : arr) {
            answer.append(str);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        No181941 no181941 = new No181941();
        String solution = no181941.solution(new String[]{"a", "b", "c"});
        System.out.println(solution);
    }
}
