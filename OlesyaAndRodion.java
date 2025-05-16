import java.util.Scanner;

public class OlesyaAndRodion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        if (t == 10 && n==1) {
            System.out.println(-1);
        } else if (t==10) {
            //System.out.println((int)Math.pow(10,n-1));
            System.out.print(1);
            for (int i = 1; i < n; i++) {
                System.out.print(0);
            }
        } else
        for (int i =0; i < n; i++) {
            System.out.print(t);
        }
    }
}
