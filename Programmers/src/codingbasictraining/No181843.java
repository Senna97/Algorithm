package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 부분 문자열인지 확인하기
public class No181843 {

    public int solution(String my_string, String target) {

        if (my_string.contains(target)) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        No181843 no181843 = new No181843();
        int solution = no181843.solution("banana", "ana");
        System.out.println(solution);
    }
}
