package introduction;

// 프로그래머스 > 코딩테스트 입문 > 숫자 찾기
public class No120904 {

    public int solution(int num, int k) {
        int answer = -1;

        String str = String.valueOf(num);
        String[] numbers = str.split("");

        for (int i = 0; i < numbers.length; i++) {
            if (Integer.parseInt(numbers[i]) == k) {
                answer = i + 1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120904 no120904 = new No120904();
        int solution = no120904.solution(232443, 4);
        System.out.println(solution);
    }
}
