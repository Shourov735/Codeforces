import java.util.Arrays;
import java.util.Scanner;

public class VanyaAndLanterns {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int l=scanner.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
        }
        Arrays.sort(a);
        int lastDiff=(l-a[n-1]);
        int maxDifferance=2*(a[0] >= lastDiff ? a[0] : lastDiff);
        for (int i = 1; i < n; i++) {
            int diff=a[i]-a[i-1];
            if(diff>maxDifferance) maxDifferance=diff;
        }
        double d=(double)maxDifferance/2;
        System.out.print(d);
    }
}
