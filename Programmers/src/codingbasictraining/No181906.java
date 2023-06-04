package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 접두사인지 확인하기
public class No181906 {

    public int solution(String my_string, String is_prefix) {

        if (is_prefix.length() > my_string.length()) {
            return 0;

        } else {

            for (int i = 0; i < is_prefix.length(); i++) {
                if (my_string.charAt(i) != is_prefix.charAt(i)) {
                    return 0;
                }
            }

            return 1;
        }

    }

    public static void main(String[] args) {
        No181906 no181906 = new No181906();
        int solution = no181906.solution("banana", "ban");
        System.out.println(solution);
    }
}
