package introduction;

// 프로그래머스 > 코딩테스트 입문 > 공 던지기
public class No120843 {

    public int solution(int[] numbers, int k) {

        int[] numbers2 = new int[k * 2 + 1];
        for (int i = 0; i < numbers2.length; i++) {

            int j = i;

            if (j >= numbers.length) {
                j = i % numbers.length;
            }

            numbers2[i] = numbers[j];
        }

        int answer = (k - 1) * 2;

        return numbers2[answer];
    }

    public static void main(String[] args) {
        No120843 no120843 = new No120843();
        int solution = no120843.solution(new int[]{1, 2, 3, 4}, 2);
        System.out.println(solution);
    }
}
