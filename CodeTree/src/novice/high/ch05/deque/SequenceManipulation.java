package novice.high.ch05.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class SequenceManipulation {

    public int getRemainder(int N) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            deque.addLast(i + 1);
        }

        while (deque.size() != 1) {
            deque.pollFirst();
            deque.addLast(deque.peekFirst());
            deque.pollFirst();
        }

        return deque.poll();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        SequenceManipulation sequenceManipulation = new SequenceManipulation();
        int answer = sequenceManipulation.getRemainder(N);
        System.out.println(answer);
    }
}
