import java.util.*;

public class CandlesAndHeight {
    public static void main(String args[])
     {
        Scanner in=new Scanner(System.in);
            int n,i,max=0,c=0;
            n=in.nextInt();
            int a[]=new int[n];
            for (i=0;i<n;i++) {
                a[i]=in.nextInt();
                
            }
            for(i=0;i<n;i++)
            {
                if(a[i]>max)
                c++;
            }
            System.out.println(+c);
        }
        |}
