package step06;

import java.util.Scanner;

public class No2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String alphabet : strArr) {
            if (str.contains(alphabet)) {
                str = str.replace(alphabet, "0");
            }
        }
        System.out.println(str.length());
    }
}