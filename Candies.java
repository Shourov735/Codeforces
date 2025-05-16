import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int a = 3;
            while(n % a !=0) a = 2 * a + 1 ;
            System.out.println(n/ a);
        }
    }
}
