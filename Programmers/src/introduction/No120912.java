package introduction;

// 프로그래머스 > 코딩테스트 입문 > 7의 개수
public class No120912 {

    public int solution(int[] array) {

        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num);
        }

        String str = sb.toString();
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '7') {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120912 no120912 = new No120912();
        int solution = no120912.solution(new int[]{7, 77, 17});
        System.out.println(solution);
    }
}
