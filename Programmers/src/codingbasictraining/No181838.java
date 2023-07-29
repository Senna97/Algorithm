package codingbasictraining;

import java.util.Date;

// 프로그래머스 > 코딩 기초 트레이닝 > 날짜 비교하기
public class No181838 {

    public int solution(int[] date1, int[] date2) {

        Date date01 = new Date(date1[0], date1[1], date1[2]);
        Date date02 = new Date(date2[0], date2[1], date2[2]);

        if (date01.before(date02)) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        No181838 no181838 = new No181838();
        int solution = no181838.solution(new int[]{2021, 12, 28}, new int[]{2021, 12, 29});
        System.out.println(solution);
    }
}
