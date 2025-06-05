import java.util.Scanner;

public class MochaAndMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int min= a[0] = scanner.nextInt();
            for (int i = 1; i < n; i++) {
                a[i] = scanner.nextInt();
                min = a[i] & min;
            }
            System.out.println(min);
        }
    }
}