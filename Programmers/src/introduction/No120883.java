package introduction;

import java.util.ArrayList;
import java.util.List;

// 프로그래머스 > 코딩테스트 입문 > 로그인 성공?
public class No120883 {

    public String solution(String[] id_pw, String[][] db) {

        String id = id_pw[0];
        String pw = id_pw[1];

        List<String> answers = new ArrayList<>();

        for (String[] idAndPw : db) {
            String dbId = idAndPw[0];
            String dbPw = idAndPw[1];

            if (id.equals(dbId) && pw.equals(dbPw)) {
                answers.add("login");
            } else if (!id.equals(dbId)) {
                answers.add("fail");
            } else {
                answers.add("wrong pw");
            }

        }

        if (answers.contains("login")) {
            return "login";
        } else if (answers.contains("wrong pw")) {
            return "wrong pw";
        } else {
            return "fail";
        }
    }

    public static void main(String[] args) {
        No120883 no120883 = new No120883();
        String solution = no120883.solution(new String[]{"meosseugi", "1234"}, new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}});
        System.out.println(solution);
    }
}
