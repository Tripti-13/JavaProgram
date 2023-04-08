import java.util.*;

//reversing the array
//Name: Tripti
//Version: 1.0
public class ArraysDS {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, i;
        n = in.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }

}
