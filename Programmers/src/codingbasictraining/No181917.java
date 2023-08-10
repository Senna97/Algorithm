package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 간단한 논리 연산
public class No181917 {

    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {

        boolean x5 = or(x1, x2);
        boolean x6 = or(x3, x4);

        return and(x5, x6);

    }

    public boolean or(boolean x, boolean y) {
        return x || y;
    }

    public boolean and(boolean x, boolean y) {
        return x && y;
    }


    public static void main(String[] args) {
        No181917 no181917 = new No181917();
        boolean solution = no181917.solution(true, false, false, false);
        System.out.println(solution);
    }
}
