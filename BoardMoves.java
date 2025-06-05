import java.util.Scanner;

public class BoardMoves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long moves = 0;
            for (long i = 1,j=0; i <= n; i+=2,j++) {
                moves +=j*( 4 * i - 4);
            }
            System.out.println(moves);
        }
    }
}
