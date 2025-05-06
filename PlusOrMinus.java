import java.util.Scanner;

public class PlusOrMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if(a+b == c) System.out.println("+");
            else System.out.println("-");
        }
    }
}
