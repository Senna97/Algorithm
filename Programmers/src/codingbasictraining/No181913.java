package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 문자열 여러 번 뒤집기
public class No181913 {

    public String solution(String my_string, int[][] queries) {

        String[] original = my_string.split("");
        String[] change = new String[original.length];
        for (int i = 0; i < change.length; i++) {
            change[i] = original[i];
        }

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];

            int indexSum = s + e;

            for (int j = s; j <= e; j++) {
                change[indexSum - j] = original[j];
            }

            for (int k = 0; k < change.length; k++) {
                original[k] = change[k];
            }
        }

        StringBuilder answer = new StringBuilder();
        for (String str : change) {
            answer.append(str);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        No181913 no181913 = new No181913();
        String solution = no181913.solution("rermgorpsam", new int[][]{{2, 3}, {0, 7}, {5, 9}, {6, 10}});
        System.out.println(solution);
    }
}
