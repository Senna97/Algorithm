package novice.high.ch05.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class CorrectParentheses {

    public String yesOrNo(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                st.push(str.charAt(i));
            } else if (str.charAt(i) == ')' && !st.empty()) {
                st.pop();
            } else {
                return "No";
            }
        }

        if (st.empty()) {
            return "Yes" ;
        } else {
            return "No";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        CorrectParentheses correctParentheses = new CorrectParentheses();
        String answer = correctParentheses.yesOrNo(str);
        System.out.println(answer);
    }
}
