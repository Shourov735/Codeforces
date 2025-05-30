import java.util.Scanner;

public class OddQueries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int q = scanner.nextInt();
            int[] a = new int[n];
            int[] cumulativeOdd = new int[n+1];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
                int odd = 0;
                if (a[j] % 2 == 1) odd=1;
                cumulativeOdd[j+1] = cumulativeOdd[j]+odd;
            }
            for (int x = 0; x < q; x++) {
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                int k = scanner.nextInt();
                String s;
                int odd = cumulativeOdd[n]-(cumulativeOdd[r]-cumulativeOdd[l-1]);
                if (k % 2 == 1) {
                    if ((odd + r-l+1) % 2 == 1) s = "YES";
                    else s = "NO";
                } else {
                    if (odd % 2 == 1) s = "YES";
                    else s = "NO";
                }
                System.out.println(s);
            }
        }
    }
}
