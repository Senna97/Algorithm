package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 문자열이 몇 번 등장하는지 세기
public class No181871 {

    public int solution(String myString, String pat) {
        int answer = 0;
        int length = pat.length();

        for (int i = 0; i < myString.length() - length + 1; i++) {
            String str = myString.substring(i, i + length);
            if (str.equals(pat)) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No181871 no181871 = new No181871();
        int solution = no181871.solution("banana", "ana");
        System.out.println(solution);
    }
}
