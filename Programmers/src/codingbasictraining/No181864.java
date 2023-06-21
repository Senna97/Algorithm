package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 문자열 바꿔서 찾기
public class No181864 {

    public int solution(String myString, String pat) {

        StringBuilder sb = new StringBuilder();

        String[] words = myString.split("");
        for (String word : words) {
            if (word.equals("A")) {
                sb.append("B");
            } else {
                sb.append("A");
            }
        }

        if (sb.toString().contains(pat)) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        No181864 no181864 = new No181864();
        int solution = no181864.solution("ABBAA", "AABB");
        System.out.println(solution);
    }

}
