package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 1로 만들기
public class No181880 {

    public int solution(int[] num_list) {

        int[] counts = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            int count = 0;

            while (true) {
                int num = num_list[i];

                if (num == 1) {
                    break;
                } else if (num % 2 == 0) {
                    num_list[i] /= 2;
                    count++;
                } else {
                    num_list[i] -= 1;
                }
            }

            counts[i] = count;
        }

        int answer = 0;
        for (int count : counts) {
            answer += count;
        }

        return answer;
    }

    public static void main(String[] args) {
        No181880 no181880 = new No181880();
        int solution = no181880.solution(new int[]{12, 4, 15, 1, 14});
        System.out.println(solution);
    }
}
