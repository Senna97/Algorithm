package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 문자열을 정수로 변환하기
public class No181848 {

    public int solution(String n_str) {
        return Integer.parseInt(n_str);
    }

    public static void main(String[] args) {
        No181848 no181848 = new No181848();
        int solution = no181848.solution("10");
        System.out.println(solution);
    }
}
