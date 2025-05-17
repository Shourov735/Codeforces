import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int count = 0;
        for (int i=(x+n-1)/n; i <= n; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

