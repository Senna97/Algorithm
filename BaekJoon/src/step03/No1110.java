package step03;

import java.util.Scanner;

public class No1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cycle = 0;
        int N2;
        int N3 = N; //무한 loop break 를 위한 if 문에 사용하기 위해 처음 입력 받은 값인 N 을 N3에 복사해놓는다.

        while (true) {
            N2 = N / 10 + N % 10; //각 자리의 숫자를 더한다. => 10으로 나눈 몫과 나머지를 더한다.
            N = N % 10 * 10 + N2 % 10; //10으로 나눈 나머지에 10을 곱한 값과 10으로 나눈 나머지를 더한다.
            cycle++; //cycle 을 1씩 증가시킨다.

            if (N == N3) { //처음 입력 받은 값과 같아지면 break
                System.out.println(cycle);
                break;
            }
        }
    }
}
