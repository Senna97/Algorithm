package introduction;

// 프로그래머스 > 코딩테스트 입문 > k의 개수
public class No120887 {

    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int l = i; l <= j; l++) {
            for (int m = 0; m < String.valueOf(l).length(); m++) {
                char c = String.valueOf(l).charAt(m);
                if (Character.toString(c).equals(String.valueOf(k))) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120887 no120887 = new No120887();
        int solution = no120887.solution(1, 13, 1);
        System.out.println(solution);
    }
}
