import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No25501 {
    public static String recursion(String s, int l, int r, int count) {
        if (l >= r) {
            return 1 + " " + count;
        } else if (s.charAt(l) != s.charAt(r)) {
            return 0 + " " + count;
        } else {
            return recursion(s, l + 1, r - 1, count+=1);
        }
    }

    public static String isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1, 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            String palindrome = isPalindrome(str);
            System.out.println(palindrome);
        }
    }
}
