package practice;

// 프로그래머스 > 연습문제 > 삼총사
public class No131705 {

    public int solution(int[] number) {
        int answer = 0;

        int count = 1;
        for (int i = number.length - 2; i <= number.length; i++) {
            count *= i;
        }
        int[] sums = new int[count / (3 * 2)];

        int i = 0;
        int j = 1;
        int k = 2;



        return answer;
    }

    public static void main(String[] args) {
        No131705 no131705 = new No131705();
        int solution = no131705.solution(new int[]{-2, 3, 0, 2, -5});
        System.out.println(solution);
    }
}