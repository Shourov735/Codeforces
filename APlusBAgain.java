import java.util.Scanner;

public class APlusBAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int n;
        for (int i = 0; i < t; i++) {
            n=scanner.nextInt();
            System.out.println(n%10 + (n/10)%10);
        }
    }
}
