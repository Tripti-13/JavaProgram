import java.util.*;
public class SimpleArraySum
{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int i,n,sum=0;
        n=in.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(i=0;i<n;i++){
            sum=sum+a[i];
        }
        System.out.println(+sum);
    }
}