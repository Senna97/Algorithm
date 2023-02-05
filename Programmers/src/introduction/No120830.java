package introduction;

// 프로그래머스 > 코딩테스트 입문 > 양꼬치
public class No120830 {

    public int solution(int n, int k) {
        int lambSkewers = n * 12000;
        int discount = k - n / 10;
        int drink = discount * 2000;
        return lambSkewers + drink;
    }

    public static void main(String[] args) {
        No120830 no120830 = new No120830();
        int solution = no120830.solution(10, 3);
        System.out.println(solution);
    }
}
