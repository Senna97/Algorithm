package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 글자 지우기
public class No181900 {

    public String solution(String my_string, int[] indices) {

        StringBuilder answer = new StringBuilder();

        String[] split = my_string.split("");
        for (int index : indices) {
            split[index] = "0";
        }

        for (String str : split) {
            if (!str.equals("0")) {
                answer.append(str);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        No181900 no181900 = new No181900();
        String solution = no181900.solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3});
        System.out.println(solution);
    }
}
