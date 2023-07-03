package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 0 떼기
public class No181847 {

    public String solution(String n_str) {

        int index = 0;
        int start = 0;

        while (n_str.charAt(index) == '0') {
            index++;
            start++;
        }

        return n_str.substring(start);
    }

    public static void main(String[] args) {
        No181847 no181847 = new No181847();
        String solution = no181847.solution("0010");
        System.out.println(solution);
    }
}
