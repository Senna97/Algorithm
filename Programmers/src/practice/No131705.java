package practice;

// 프로그래머스 > 연습문제 > 삼총사
public class No131705 {

    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length - 2; i++) {
            int first = number[i];

            for (int j = i + 1; j < number.length - 1; j++) {
                int second = number[j];

                for (int k = j + 1; k < number.length; k++) {
                    int third = number[k];
                    int sum = first + second + third;

                    if (sum == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No131705 no131705 = new No131705();
        int solution = no131705.solution(new int[]{-2, 3, 0, 2, -5});
        System.out.println(solution);
    }
}