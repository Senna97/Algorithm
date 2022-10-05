package step04;

import java.util.Scanner;

public class No2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = arr[0];
        int maxIndex = 0; //max 인덱스를 위한 변수 선언

        for (int i = 0; i < arr.length; i++) {
            int j = sc.nextInt();
            arr[i] = j;

            for (int a : arr) {
                if (a > max) {
                    max = a;
                }
            }

            for (int a : arr) {
                if (arr[i] == max) { //max 인덱스 찾기
                    maxIndex = i;
                }
            }
        }

        System.out.println(max);
        System.out.println(maxIndex + 1); //문제에서 인덱스가 아닌 몇번째인지 구하라고 했기 때문에 +1 해준다.
    }
}
