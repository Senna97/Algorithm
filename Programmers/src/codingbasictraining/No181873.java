package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 특정한 문자를 대문자로 바꾸기
public class No181873 {

    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder();

        if (my_string.contains(alp)) {
            String[] split = my_string.split("");

            for (String str : split) {
                if (str.equals(alp)) {
                    str = str.toUpperCase();
                }

                sb.append(str);
            }

            return sb.toString();
        } else {
            return my_string;
        }
    }

    public static void main(String[] args) {
        No181873 no181873 = new No181873();
        String solution = no181873.solution("programmers", "p");
        System.out.println(solution);
    }
}
