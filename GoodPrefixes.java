import java.util.Scanner;

public class GoodPrefixes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int good = 0;
            int max =-1;
            long[] sum = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                if(a[i] > max) max = a[i];
                if(i!=0) sum[i]=sum[i-1];
                sum[i]+=a[i];
                if(sum[i]-max==max) good++;
            }
            System.out.println(good);
        }
    }
}
