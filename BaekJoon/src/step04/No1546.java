package step04;

import java.util.Scanner;

public class No1546 {

    public static double MaxValue(double[] arr) { //배열에서 최댓값을 구하는 메서드
        double max = arr[0];

        for (double a : arr) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

    public static double[] ScoreCalculator(double[] arr, double max) { //점수를 (점수 / 최댓값 * 100)으로 고치는 메서드
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / max * 100;
        }
        return arr;
    }

    public static void Average(double[] arr) { //평균을 구하는 메서드
        double sum = 0;
        double average = 0;

        for (double a : arr) {
            sum += a;
            average = sum / arr.length;
        }
        System.out.println(average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] score = new double[N];

        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }

        double M = MaxValue(score);
        ScoreCalculator(score, M);
        Average(score);
    }
}
