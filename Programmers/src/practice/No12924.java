package practice;

// 프로그래머스 > 연습문제 > 숫자의 표현
public class No12924 {

    public int solution(int n) {

        if (n == 1 || n == 2) {
            return 1;
        } else {
            int originN = n;
            int count = 0;
            int[] minus = new int[n / 2 + 1];

            for (int i = 0; i < minus.length; i++) {
                minus[i] = i + 1;
            }

            int minusIdx = 0;
            int startIdx = 0;

            while (minusIdx < minus.length) {

                n -= minus[minusIdx];
                minusIdx++;

                if (n == 0) {
                    count++;
                } else if (n > 0) {
                    continue;
                }
                n = originN;
                startIdx += 1;
                minusIdx = startIdx;
            }

            return count + 1;
        }
    }

    public static void main(String[] args) {
        No12924 no12924 = new No12924();
        int solution = no12924.solution(3);
        System.out.println(solution);
    }
}