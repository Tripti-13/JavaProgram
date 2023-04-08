import java.util.*;

public class AVeryBigSum {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n, i;
        long sum = 0;
        n = in.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int num:a) {
            sum = sum + num;
        }
        System.out.println(+sum);
    }
}
