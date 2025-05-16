import java.util.Scanner;

public class B1 {
    static int f(int[] x,int l,int r){
        int sum =0;
        for (int i = l; i <= r; i++) {
            sum|=x[i];
        }
        return  sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        int max =0;
        for (int l = 0; l < n; l++) {
            for (int r = l; r < n; r++) {
                int sum=f(a,l,r)+f(b,l,r);
                if(sum>max) max=sum;
            }
        }
        System.out.println(max);
    }
}