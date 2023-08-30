package codingbasictraining;

import java.math.BigInteger;

// 프로그래머스 > 코딩 기초 트레이닝 > 두 수의 합
public class No181846 {

    public String solution(String a, String b) {

        if (a.length() <= 9 && b.length() <= 9) {
            int intA = Integer.parseInt(a);
            int intB = Integer.parseInt(b);

            return String.valueOf(intA + intB);

        } else if (a.length() <= 18 && b.length() <= 18) {
            long longA = Long.parseLong(a);
            long longB = Long.parseLong(b);

            return String.valueOf(longA + longB);

        } else {
            BigInteger bigA = new BigInteger(a);
            BigInteger bigB = new BigInteger(b);

            return String.valueOf(bigA.add(bigB));

        }

    }

    public static void main(String[] args) {
        No181846 no181846 = new No181846();
        String solution = no181846.solution("582", "734");
        System.out.println(solution);
    }
}
