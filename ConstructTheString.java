import java.util.Scanner;

public class ConstructTheString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                System.out.print((char)('a' + j % b));
            }
            System.out.println();
        }
    }
}
