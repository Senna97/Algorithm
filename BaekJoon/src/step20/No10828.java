package step20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (str.contains("push")) {
                String[] s = str.split(" ");
                stack.push(Integer.valueOf(s[1]));
            } else if (str.contains("top")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            } else if (str.contains("size")) {
                System.out.println(stack.size());
            } else if (str.contains("empty")) {
                int j = stack.isEmpty() ? 1 : 0;
                System.out.println(j);
            } else if (str.contains("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            }
        }
    }
}
