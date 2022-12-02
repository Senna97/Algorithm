package novice.high.ch05.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] commands = new String[N];
        for (int i = 0; i < commands.length; i++) {
            commands[i] = br.readLine();
        }

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < commands.length; i++) {
            if (commands[i].contains("push")) {
                String[] s = commands[i].split(" ");
                st.push(Integer.valueOf(s[1]));
            } else if (commands[i].contains("pop")) {
                int j = st.pop();
                System.out.println(j);
            } else if (commands[i].contains("size")) {
                System.out.println(st.size());
            } else if (commands[i].contains("empty")) {
                int j = st.empty() ? 1: 0;
                System.out.println(j);
            } else if (commands[i].contains("top")) {
                int j = st.peek();
                System.out.println(j);
            }
        }
    }
}
