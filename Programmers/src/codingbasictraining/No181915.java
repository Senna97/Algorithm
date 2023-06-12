package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 글자 이어 붙여 문자열 만들기
public class No181915 {

    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();

        for (int i : index_list) {
            answer.append(my_string.charAt(i));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        No181915 no181915 = new No181915();
        String solution = no181915.solution("cvsgiorszzzmrpaqpe", new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7});
        System.out.println(solution);
    }
}
