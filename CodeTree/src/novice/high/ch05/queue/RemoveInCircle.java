package novice.high.ch05.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class RemoveInCircle {

    public void printRemoveSequence(int a, int b) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < a; i++) {
            queue.add(i + 1);
        }

        while (queue.size() != 0) {
            for (int i = 1; i < b; i++) {
                queue.add(queue.peek());
                queue.poll();
            }
            System.out.printf("%d ", queue.poll());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        RemoveInCircle removeInCircle = new RemoveInCircle();
        removeInCircle.printRemoveSequence(N, K);
    }
}
