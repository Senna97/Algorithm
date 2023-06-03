package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 수 조작하기 1
public class No181926 {

    public int solution(int n, String control) {

        for (int i = 0; i < control.length(); i++) {

            switch (control.charAt(i)) {
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }

        }

        return n;
    }

    public static void main(String[] args) {
        No181926 no181926 = new No181926();
        int wsdawsdassw = no181926.solution(0, "wsdawsdassw");
        System.out.println(wsdawsdassw);
    }
}
