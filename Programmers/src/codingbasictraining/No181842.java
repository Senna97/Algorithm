package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 부분 문자열
public class No181842 {

    public int solution(String str1, String str2) {

        if (str2.contains(str1)) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        No181842 no181842 = new No181842();
        int solution = no181842.solution("abc", "aabcc");
        System.out.println(solution);
    }
}
