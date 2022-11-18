package step06;

import java.util.Objects;

public class No2941 {
    public static void main(String[] args) {
        String str = "ljes=njak";
        String[] strArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String newStr = "";
        for (int i = 0; i < strArr.length; i++) {
            if (str.contains(strArr[i])) {
                newStr += str.replace(strArr[i], "0");
                strArr[i] = "0";
            }
        }

        System.out.println(newStr);

        int count = 0;
        for (String s : strArr) {
            if (Objects.equals(s, "0")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
