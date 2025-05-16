import java.util.Scanner;

public class NewYearCandles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = a;
        while (a >= b) {
            x = x + a/b;
            a = a % b + a/b ;
        }
        System.out.print(x);
    }
}
