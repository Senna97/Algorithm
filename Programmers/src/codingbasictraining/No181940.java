package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > n 번째 원소부터
public class No181940 {

    public String solution(String my_string, int k) {

        return my_string.repeat(k);
    }

    public static void main(String[] args) {
        No181940 no181940 = new No181940();
        String solution = no181940.solution("string", 3);
        System.out.println(solution);
    }
}
