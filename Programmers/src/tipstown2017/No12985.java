package tipstown2017;

// 프로그래머스 > 2017 팁스타운 > 예상 대진표
public class No12985 {

    public int solution(int n, int a, int b) {
        int answer = 0;

        while (Math.abs(a - b) != 1 || a / 2 == b / 2) {
            a = divideTwo(a);
            b = divideTwo(b);

            answer += 1;
        }

        return answer + 1;
    }

    public int divideTwo(int num) {
        if (num % 2 != 0) {
            num = num / 2 + 1;
        } else {
            num /= 2;
        }
        return num;
    }

    public static void main(String[] args) {
        No12985 no12985 = new No12985();
        int solution = no12985.solution(8, 4, 5);
        System.out.println(solution);
    }
}