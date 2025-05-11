import java.util.Arrays;
import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int earn=0;
        for (int i = 0; i < m && a[i]<0 ; i++) {
            earn+=a[i];
        }
        System.out.println(Math.abs(earn));
    }
}
