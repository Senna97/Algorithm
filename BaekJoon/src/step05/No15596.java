package step05;

public class No15596 {

    long sum(int[] a) {
        long sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        No15596 no15596 = new No15596();
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long sum = no15596.sum(a);
        System.out.println(sum); // 55
    }
}
