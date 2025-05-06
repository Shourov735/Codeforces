import java.util.Arrays;
import java.util.Scanner;

public class OddOneOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] a = new int[3];
        for (int i = 0; i < t; i++) {
            a[0] = scanner.nextInt();
            a[1] = scanner.nextInt();
            a[2] = scanner.nextInt();
            Arrays.sort(a);
            if (a[0] == a[1]) System.out.println(a[2]);
            else System.out.println(a[0]);
        }
    }
}
