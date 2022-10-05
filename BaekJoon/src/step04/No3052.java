package step04;

import java.util.Scanner;

public class No3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10]; //수 10개를 입력받을 배열
        int[] remainder = new int[10]; //42로 나눈 나머지를 저장할 배열
        int[] Map = new int[42]; //서로 다른 값이 몇 개 있는지 세기 위한 배열 -> 모든 원소가 0으로 초기화되어 있음
        int count = 0;

        for (int i = 0; i < arr.length; i++) { //입력받은 10개의 수로 배열 arr 채우기
            int j = sc.nextInt();
            arr[i] = j;

            for (int a : arr) { //arr 배열의 원소 하나하나를 돌며 42로 나눈 나머지를 배열 remainder 에 저장한다.
                remainder[i] = j % 42;
            }
        }

        for (int i : remainder) { //나머지에 해당하는 Map 배열의 index 를 1씩 증가시킨다.
            Map[i]++;            // ex) 나머지가 2라면 Map[2]를 0에서 1로 만든다.
        }

        for (int i : Map) { //배열 Map 에서 0이 아닌 것을 만날때마다 count 를 1씩 증가시킨다.
            if (i != 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
