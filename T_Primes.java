import java.util.Scanner;

public class T_Primes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long x=scanner.nextLong();
            int divisor=0;
            long loop=x/2;
            for (long j = 1; j <= loop; j++) {
                if(x%j==0) divisor++;
            }
            if(divisor==2) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
