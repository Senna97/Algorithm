package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 소문자로 바꾸기
public class No181876 {

    public String solution(String myString) {
        return myString.toLowerCase();
    }

    public static void main(String[] args) {
        No181876 no181876 = new No181876();
        String solution = no181876.solution("aBcDeFg");
        System.out.println(solution);
    }
}
