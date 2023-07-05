package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 부분 문자열 이어 붙여 문자열 만들기
public class No181911 {

    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            answer.append(my_strings[i], parts[i][0], parts[i][1] + 1);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        No181911 no181911 = new No181911();
        String solution = no181911.solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"}, new int[][]{{0, 4}, {1, 2}, {3, 5}, {7, 7}});
        System.out.println(solution);
    }
}
