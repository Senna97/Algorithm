package introduction;

// 프로그래머스 > 코딩테스트 입문 > 합성수 찾기
public class No120846 {

    public int solution(int n) {
        int answer = 0;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        int divide = 2;
        int index = 3;
        while (divide <= Math.sqrt(n)) {

            if (arr[index] / divide != 1 && arr[index] % divide == 0) {
                arr[index] = 0;
            }
            index++;

            if (index > n - 1) {
                index = 3;
                divide++;
            }
        }

        for (int i : arr) {
            if (i == 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No120846 no120846 = new No120846();
        int solution = no120846.solution(10);
        System.out.println(solution);
    }
}
