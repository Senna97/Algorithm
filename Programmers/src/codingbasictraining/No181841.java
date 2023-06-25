package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 꼬리 문자열
public class No181841 {

    public String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();

        for (String str : str_list) {
            if (!str.contains(ex)) {
                answer.append(str);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        No181841 no181841 = new No181841();
        String solution = no181841.solution(new String[]{"abc", "def", "ghi"}, "ef");
        System.out.println(solution);
    }
}
