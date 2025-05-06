import java.util.Scanner;

public class CodeforcesCheaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        char ch;
        for (int i = 0; i < t; i++) {
            ch = scanner.next().charAt(0);
            if (ch == 'c' || ch == 'o' || ch == 'd' || ch == 'e' || ch == 'f' || ch == 'r' || ch == 's')
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
