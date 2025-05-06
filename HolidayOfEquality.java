import java.util.Arrays;
import java.util.Scanner;

public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int s = 0;
        for (int i = 0; i < n; i++) {
            s = s + a[n - 1] - a[i];
        }
        System.out.println(s);
    }
}
