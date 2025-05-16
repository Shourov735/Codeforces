import java.util.Arrays;
import java.util.Scanner;

public class BalancedRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int count = 1 ;
            int max =1;
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            Arrays.sort(a);
            for (int j = 1; j < n; j++) {
                if(a[j]-a[j-1] <= k) count++;
                else {
                    max = Math.max(max,count);
                    count=1;
                }
            }
            max = Math.max(max,count);
            System.out.println(n-max);
        }
    }
}
