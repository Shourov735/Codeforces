import java.util.Scanner;

public class InterestingDrink {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int x ;
        int[] c = new int[1000001];
        for (int i = 0; i < n; i++) {
            x = scanner.nextInt();
            c[x]++;
        }
		for (int i = 1 ; i <= 1000000; i++) {
			c[i]+=c[i-1];
		}
        int q = scanner.nextInt();
        int m;
        for (int i = 0; i < q; i++) {
            m = scanner.nextInt();
            if(m > 1000000) {
                System.out.println(n);
            }
			else 
            System.out.println(c[m]);
        }
    }
}
