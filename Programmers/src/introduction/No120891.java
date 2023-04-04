package introduction;

// 프로그래머스 > 코딩테스트 입문 > 369게임
public class No120891 {

    public int solution(int order) {
        int answer = 0;
        String strOrder = String.valueOf(order);
        for (int i = 0; i < strOrder.length(); i++) {
            if (strOrder.charAt(i) == '3' || strOrder.charAt(i) == '6' || strOrder.charAt(i) == '9') {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        No120891 no120891 = new No120891();
        int solution = no120891.solution(3);
        System.out.println(solution);
    }
}
