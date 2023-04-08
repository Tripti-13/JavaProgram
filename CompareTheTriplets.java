
import java.util.*;

public class CompareTheTriplets {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int i, j, p = 0, q = 0;   //p-> Alice and q->Bob
        int a[] = new int[3];
        int b[] = new int[3];
        for (i = 0; i < 3; i++) {
            a[i] = in.nextInt();
        }
        for (i = 0; i < 3;i++) {
            b[i] = in.nextInt();
        }
        for(i=0;i<3;i++){
         if (a[i] > b[i]) {
            p++;
        }
        else if (b[i] > a[i]) {
            q++;
        }

    }
    System.out.println(+p+" "+q);
    in.close();
}
}
