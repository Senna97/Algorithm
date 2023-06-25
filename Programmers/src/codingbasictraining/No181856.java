package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 배열 비교하기
public class No181856 {

    public int solution(int[] arr1, int[] arr2) {

        if (arr1.length > arr2.length) {
            return 1;
        } else if (arr2.length > arr1.length) {
            return -1;
        } else {
            int sum1 = 0;
            for (int i : arr1) {
                sum1 += i;
            }

            int sum2 = 0;
            for (int i : arr2) {
                sum2 += i;
            }

            return Integer.compare(sum1, sum2);
        }

    }

    public static void main(String[] args) {
        No181856 no181856 = new No181856();
        int solution = no181856.solution(new int[]{49, 13}, new int[]{70, 11, 2});
        System.out.println(solution);
    }
}
