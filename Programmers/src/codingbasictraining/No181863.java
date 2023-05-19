package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > rny_string
public class No181863 {

    public String solution(String rny_string) {

        return rny_string.replaceAll("m", "rn");

    }

    public static void main(String[] args) {
        No181863 no181863 = new No181863();
        String solution = no181863.solution("masterpiece");
        System.out.println(solution);
    }
}
