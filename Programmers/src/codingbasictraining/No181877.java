package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 대문자로 바꾸기
public class No181877 {

    public String solution(String myString) {

        return myString.toUpperCase();
    }

    public static void main(String[] args) {
        No181877 no181877 = new No181877();
        String solution = no181877.solution("aBcDeFg");
        System.out.println(solution);
    }
}
