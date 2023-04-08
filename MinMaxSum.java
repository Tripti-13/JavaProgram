import java.util.*;

public class MinMaxSum {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int i, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, maxsum = 0, minsum = 0;
        int a[] = new int[5];
        for (i = 0; i < 5; i++) {
            a[i] = in.nextInt();
        }

        sum1 = a[1] + a[2] + a[3] + a[4];
        sum2 = a[0] + a[2] + a[3] + a[4];

        sum4 = a[0] + a[1] + a[2] + a[4];
        sum5 = a[0] + a[1] + a[2] + a[3];

        if (sum1 > maxsum)
            maxsum = sum1;
        else if (sum2 > maxsum)
            maxsum = sum2;
        else if (sum3 > maxsum)
            maxsum = sum3;
        else if (sum4 > maxsum)
            maxsum = sum4;
        else
            maxsum = sum5;

        if (sum1 < minsum)
            minsum = sum1;
           else if (sum2 < minsum)
            minsum = sum2;
            else if (sum3 < minsum)
            minsum = sum3;
            else if (sum4 < minsum)
            minsum = sum4;
            else 
            minsum = sum5;

        System.out.println(+minsum + " " + maxsum);

    }
}