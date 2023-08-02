package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
public class No181872 {

    public String solution(String myString, String pat) {
        int i = myString.lastIndexOf(pat);
        return myString.substring(0, i + pat.length());
    }

    public static void main(String[] args) {
        No181872 no181872 = new No181872();
        String solution = no181872.solution("AbCdEFG", "dE");
        System.out.println(solution);
    }
}
