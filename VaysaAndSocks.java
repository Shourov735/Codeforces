import java.util.Scanner;

public class VaysaAndSocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int days = n;
        for (int i = 1; i*m <= days ; i++) {
            days++;
        }
        System.out.println(days);
    }
}
