import java.util.Scanner;

public class NewYearTransportation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 1; i < n ; i++) {
            a[i] = scanner.nextInt();
        }
        int i ;
        for ( i = 1; i < t; ) {
            i = i + a[i];
        }
        if(i==t) System.out.println("YES");
        else System.out.println("NO");
    }
}
