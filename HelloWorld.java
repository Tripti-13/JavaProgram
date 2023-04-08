import java.util.*;

public class HelloWorld {

    static long arrayManipulation(int n, int[][] queries) {
        long outputArray[] = new long[n + 2];
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int c = queries[i][2];
            outputArray[a] = outputArray[a] + c;
            outputArray[b + 1] = outputArray[b + 1] - c;
        }
        long max = getMax(outputArray);
        return max;
    }

    public static long getMax(long[] inputArray) {
        long max = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum = sum + inputArray[i];
            max = Math.max(max, sum);

        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int queries[][] = new int[m][3];
        for (int i = 0; i < m; i++) {
            queries[i][0] = in.nextInt();
            queries[i][1] = in.nextInt();
            queries[i][2] = in.nextInt();
        }
        long max = arrayManipulation(n, queries);
        System.out.println(max);
    }
}
