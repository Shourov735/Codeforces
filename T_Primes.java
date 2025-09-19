import java.util.Scanner;

public class T_Primes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long x=scanner.nextLong();
            int divisor=0;
            long loop=(long)Math.sqrt(x);
            for (long j = 2; j*j <= loop; j++) {
                if(loop%j==0){
                    divisor++;
                    break;
                }
            }
            if(x>3 && loop*loop==x && divisor==0) System.out.println("YES");
            else System.out.println("NO");
        }
		scanner.close();
    }
}
