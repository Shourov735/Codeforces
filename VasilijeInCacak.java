import java.util.Scanner;

public class VasilijeInCacak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            long x = scanner.nextLong();
            long minsum = k*(k+1)/2;
            long maxsum = n*(n+1)/2-(n-k)*(n-k+1)/2;
            System.out.println(minsum<=x && x<=maxsum ? "YES" : "NO");
        }
    }
}
