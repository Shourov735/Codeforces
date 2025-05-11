import java.util.Scanner;

public class KthNotDivisableByN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int x=1,j=1;
            for ( ; x <= k; j++) {
                if (j % n == 0) continue;
                x++;
            }
            System.out.println(j-1);
        }
    }
}
