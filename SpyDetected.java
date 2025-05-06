import java.util.Scanner;

public class SpyDetected {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n=scanner.nextInt();
            int[] a=new int[n+1];
            a[n]=0;
            for (int j = 0; j < n; j++) {
                a[j]=scanner.nextInt();
            }
            int spy = 0;
            for (int j = 1; j < n; j++) {
                if(a[j-1]!=a[j] && a[j]!=a[j+1]){
                    spy=j;
                    break;
                }
            }
            System.out.println(spy+1);
        }

    }
}
