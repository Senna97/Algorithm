package step06;

import java.util.Objects;
import java.util.Scanner;

public class No1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] strArr = str.split(" ");

        int count = 0;
        for (String s : strArr) {
            if (!Objects.equals(s, "")) {
                count++;
            }
        }

        System.out.println(count);
    }
}
