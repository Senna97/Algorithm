package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 접미사인지 확인하기
public class No181908 {

    public int solution(String my_string, String is_suffix) {

        int diff;

        if (my_string.length() >= is_suffix.length()) {
            diff = my_string.length() - is_suffix.length();
        } else {
            return 0;
        }

        int index = 0;
        while (true) {

            if (index == is_suffix.length()) {
                return 1;
            }

            if (my_string.charAt(index + diff) == is_suffix.charAt(index)) {
                index++;
            } else {
                return 0;
            }
        }

    }

    public static void main(String[] args) {
        No181908 no181908 = new No181908();
        int solution = no181908.solution("banana", "ana");
        System.out.println(solution);
    }
}
