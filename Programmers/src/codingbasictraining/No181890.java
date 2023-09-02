package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 왼쪽 오른쪽
public class No181890 {

    public String[] solution(String[] str_list) {

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }

        return new String[]{};
    }

    public static void main(String[] args) {
        No181890 no181890 = new No181890();
        String[] solution = no181890.solution(new String[]{"u", "u", "l", "r"});
        System.out.println(Arrays.toString(solution));
    }
}
