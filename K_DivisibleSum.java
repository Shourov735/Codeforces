import java.util.Scanner;

public class K_DivisibleSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int min;
            if (k < n && n%k!=0) {
                min = 2;
            } else {
                min = k / n;
                if (k % n != 0) min++;
            }
            System.out.println(min);
        }
    }
}