package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 9로 나눈 나머지
public class No181914 {

    public int solution(String number) {

        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        return sum % 9;
    }

    public static void main(String[] args) {
        No181914 no181914 = new No181914();
        int solution = no181914.solution("78720646226947352489");
        System.out.println(solution);
    }
}
