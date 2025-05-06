import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        x: for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a=new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=scanner.nextInt();
            }
            Arrays.sort(a);
            for (int j = 1; j < n; j++) {
                if(a[j]-a[j-1] > 1) {
                    System.out.println("NO");
                    continue x;
                }
            }
            System.out.println("YES");
        }
    }
}
