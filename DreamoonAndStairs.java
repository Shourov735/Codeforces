import java.util.Scanner;

public class DreamoonAndStairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = (n+1)/2; i <= n ; i++) {
            if(i%m==0) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
