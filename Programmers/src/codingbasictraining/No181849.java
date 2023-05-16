package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 부분 문자열인지 확인하기
public class No181849 {

    public int solution(String num_str) {
        int answer = 0;

        String[] split = num_str.split("");
        for (String str : split) {
            answer += Integer.parseInt(str);
        }

        return answer;
    }

    public static void main(String[] args) {
        No181849 no181849 = new No181849();
        int solution = no181849.solution("123456789");
        System.out.println(solution);
    }
}
