import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a1 = scanner.nextInt();
            int a2 = scanner.nextInt();
            int b1 = scanner.nextInt();
            int b2 = scanner.nextInt();
            int win = 0;
            if ( (a1 >= b1 && a2 > b2) || (a1 > b1 && a2 >= b2) ) win++;
            if ( (a1 >= b2 && a2 > b1) || (a1 > b2 && a2 >= b1) ) win++;
            System.out.println(2 * win);
        }
    }
}
