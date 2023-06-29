package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 더 크게 합치기
public class No181939 {

    public int solution(int a, int b) {

        String sb1 = String.valueOf(a) + String.valueOf(b);

        String sb2 = String.valueOf(b) + String.valueOf(a);

        return Math.max(Integer.parseInt(sb1), Integer.parseInt(sb2));

    }

    public static void main(String[] args) {
        No181939 no181939 = new No181939();
        int solution = no181939.solution(9, 91);
        System.out.println(solution);
    }
}
