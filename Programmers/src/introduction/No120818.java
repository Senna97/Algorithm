package introduction;

// 프로그래머스 > 코딩테스트 입문 > 옷가게 할인 받기
public class No120818 {

    public int solution(int price) {
        if (price >= 500000) {
            return (int) (price * 0.8);
        } else if (price >= 300000) {
            return (int) (price * 0.9);
        } else if (price >= 100000) {
            return (int) (price * 0.95);
        } else {
            return price;
        }
    }

    public static void main(String[] args) {
        No120818 no120818 = new No120818();
        int solution = no120818.solution(150000);
        System.out.println(solution);
    }
}
