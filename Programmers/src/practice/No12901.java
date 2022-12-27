package practice;

// 프로그래머스 > 연습문제 > 2016년
public class No12901 {

    public String solution(int a, int b) {
        String[] days = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int day = 0;
        switch (a) {
            case 1:
                day = b;
                break;
            case 2:
                day = b + 31;
                break;
            case 3:
                day = b + 31 + 29;
                break;
            case 4:
                day = b + 31 + 29 + 31;
                break;
            case 5:
                day = b + 31 + 29 + 31 + 30;
                break;
            case 6:
                day = b + 31 + 29 + 31 + 30 + 31;
                break;
            case 7:
                day = b + 31 + 29 + 31 + 30 + 31 + 30;
                break;
            case 8:
                day = b + 31 + 29 + 31 + 30 + 31 + 30 + 31;
                break;
            case 9:
                day = b + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
                break;
            case 10:
                day = b + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                break;
            case 11:
                day = b + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                break;
            case 12:
                day = b + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                break;
        }

        String answer = "";
        switch (day % 7) {
            case 1:
                answer = days[5];
                break;
            case 2:
                answer = days[6];
                break;
            case 3:
                answer = days[0];
                break;
            case 4:
                answer = days[1];
                break;
            case 5:
                answer = days[2];
                break;
            case 6:
                answer = days[3];
                break;
            case 0:
                answer = days[4];
                break;
        }

        return answer;
    }

    public static void main(String[] args) {
        No12901 no12901 = new No12901();
        String solution = no12901.solution(5, 24);
        System.out.println(solution);
    }
}
