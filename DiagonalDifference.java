//to be corrected
import java.util.*;

public class DiagonalDifference {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int i, j, n, sum = 0, summ = 0, difference;
        n = in.nextInt();
        int a[][] = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j)
                    System.out.print(a[i

                if (i + j == (n - 1))
                    em.out.print(a[i][j]);

            }
        }
        difference = (sum - summ);
        int p = Math.abs(difference);

        System.out.println(+p);

    }

}