package step04;

import java.util.Scanner;

public class No10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            int j = sc.nextInt();
            arr[i] = j;
        }

        //입력 받은 정수로 배열을 채우고 난후 min 과 max 를 선언한다.
        int min = arr[0]; //배열의 첫 번째 원소를 기준으로 잡고
        int max = arr[0];

        for (int a : arr) { //for-each 문으로 배열의 원소 각각을 비교한다.
            if (a < min) {
                min = a;
            }
        }

        for (int a : arr) {
            if (a > max) {
                max = a;
            }
        }

        System.out.println(min + " " + max);
    }
}
