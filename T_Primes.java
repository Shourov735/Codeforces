import java.util.Scanner;

public class T_Primes {
    static int[] isPrime = new int[1000007];
    static void sieve(){
        isPrime[0]=0;
        isPrime[1]=0;
        for (int i = 2; i < 1000007; i++)
        {
            isPrime[i]=1;
        }
        for (int i = 2; i < 1000007; i++)
        {
            if(isPrime[i]==0){
                for (int j = 2*i; j < 1000007; j+=i)
                {
                    isPrime[j]=0;
                }
            }
        }

    }

    public static void main(String[] args) {
        sieve();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long x=scanner.nextLong();
            int root=(int) Math.sqrt(x);
            if((long)root*root==x && isPrime[root]==1 ) System.out.println("YES");
            else System.out.println("NO");
        }
		scanner.close();
    }
}
