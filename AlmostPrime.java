import java.util.Scanner;

public class AlmostPrime {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int almostPrime = 0;
        for (int i = 1; i <= n; i++) {
            int prime = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    if (isPrime(j)) prime++;
                }
            }
            if (prime == 2) {
                almostPrime++;
            }
        }
        System.out.println(almostPrime);
    }
}
