package introduction;

// 프로그래머스 > 코딩테스트 입문 > 인덱스 바꾸기
public class No120895 {

    public String solution(String my_string, int num1, int num2) {
        String[] split = my_string.split("");

        String answer = split[num1];
        split[num1] = split[num2];
        split[num2] = answer;

        StringBuilder stringBuilder = new StringBuilder();
        for (String str : split) {
            stringBuilder.append(str);
        }

        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {
        No120895 no120895 = new No120895();
        String solution = no120895.solution("hello", 1, 2);
        System.out.println(solution);
    }
}
