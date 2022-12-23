package practice;

// 프로그래머스 > 연습문제 > 다음 큰 숫자
public class No12911 {

    public int solution(int n) {

        String str = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                count++;
            }
        }

        int compare = n + 1;
        while (true) {
            String compareStr = Integer.toBinaryString(compare);
            int compareCount = 0;
            for (int i = 0; i < compareStr.length(); i++) {
                if (compareStr.charAt(i) == '1') {
                    compareCount++;
                }
            }

            if (count == compareCount) {
                break;
            } else {
                compare += 1;
            }
        }

        return compare;
    }

    public static void main(String[] args) {
        No12911 no12911 = new No12911();
        int solution1 = no12911.solution(78);
        System.out.println(solution1);
        int solution2 = no12911.solution(15);
        System.out.println(solution2);
    }
}
