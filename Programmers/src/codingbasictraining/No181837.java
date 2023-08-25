package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 커피 심부름
public class No181837 {

    public int solution(String[] order) {
        int answer = 0;

        for (String menu : order) {
            if (menu.contains("americano") || menu.equals("anything")) {
                answer += 4500;
            } else if (menu.contains("cafelatte")) {
                answer += 5000;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        No181837 no181837 = new No181837();
        int solution = no181837.solution(new String[]{"cafelatte", "americanoice", "hotcafelatte", "anything"});
        System.out.println(solution);
    }
}
