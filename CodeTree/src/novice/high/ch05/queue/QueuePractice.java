package novice.high.ch05.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (str.contains("push")) {
                String[] s = str.split(" ");
                queue.add(Integer.valueOf(s[1]));
            } else if (str.contains("pop")) {
                Integer j = queue.poll();
                System.out.println(j);
            } else if (str.contains("size")) {
                int j = queue.size();
                System.out.println(j);
            } else if (str.contains("empty")) {
                int j = queue.isEmpty() ? 1 : 0;
                System.out.println(j);
            } else if (str.contains("front")) {
                Integer j = queue.peek();
                System.out.println(j);
            }
        }
    }
}
