package introduction;

// 프로그래머스 > 코딩테스트 입문 > 문자열 밀기
public class No120921 {

    public int solution(String A, String B) {

        if (A.equals(B)) {
            return 0;

        } else {
            int answer = 1;
            int length = A.length();

            for (int i = length - 1; i > 0; i--) {

                String first = A.substring(i);
                String last = A.substring(0, i);

                StringBuilder sb = new StringBuilder();
                sb.append(first);
                sb.append(last);

                if (B.contentEquals(sb)) {
                    return answer;
                } else {
                    answer++;
                }

            }

            return -1;
        }

    }

    public static void main(String[] args) {
        No120921 no120921 = new No120921();
        int solution = no120921.solution("hello", "ohell");
        System.out.println(solution);
    }
}
