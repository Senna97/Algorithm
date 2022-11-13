package step05;

import java.util.ArrayList;
import java.util.List;

public class No4673 {

    // 함수 d를 정의
    int d(int n) {
        int ans = n;

        while (n > 0) {
            ans += n % 10;
            n = n / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        No4673 no4673 = new No4673();

        List<Integer> flags = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            flags.add(i + 1);
        }

        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            nums.add(no4673.d(i));
        }

        for (Integer num : nums) {
            flags.remove(num);
        }

        for (Integer flag : flags) {
            System.out.println(flag);
        }
    }
}
