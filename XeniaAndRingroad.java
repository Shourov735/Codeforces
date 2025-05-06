import java.util.Scanner;

public class XeniaAndRingroad {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[] a=new int[m];
        for (int i = 0; i < m; i++) {
            a[i]=scanner.nextInt();
        }
        long time=a[0]-1;
        for (int i = 1; i < m; i++) {
            if(a[i]>=a[i-1]) time+=a[i]-a[i-1];
            else {
                time+=n-a[i-1]+a[i];
            }
        }
        System.out.print(time);
    }
}
