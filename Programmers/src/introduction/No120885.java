package introduction;

// 프로그래머스 > 코딩테스트 입문 > 이진수 더하기
public class No120885 {

    public String solution(String bin1, String bin2) {


        int first = Integer.parseInt(bin1, 2);
        int second = Integer.parseInt(bin2, 2);

        return Integer.toBinaryString(first + second);
    }

    public static void main(String[] args) {
        No120885 no120885 = new No120885();
        String solution = no120885.solution("10", "11");
        System.out.println(solution);
    }
}
