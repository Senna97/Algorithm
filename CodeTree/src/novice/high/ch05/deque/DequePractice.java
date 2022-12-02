package novice.high.ch05.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequePractice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (str.contains("push_front")) {
                String[] s = str.split(" ");
                deque.addFirst(Integer.valueOf(s[1]));
            } else if (str.contains("push_back")) {
                String[] s = str.split(" ");
                deque.addLast(Integer.valueOf(s[1]));
            } else if (str.contains("pop_front")) {
                System.out.println(deque.pollFirst());
            } else if (str.contains("pop_back")) {
                System.out.println(deque.pollLast());
            } else if (str.contains("size")) {
                System.out.println(deque.size());
            } else if (str.contains("empty")) {
                int j = deque.isEmpty() ? 1 : 0;
                System.out.println(j);
            } else if (str.contains("front")) {
                System.out.println(deque.peekFirst());
            } else if (str.contains("back")) {
                System.out.println(deque.peekLast());
            }
        }
    }
}
