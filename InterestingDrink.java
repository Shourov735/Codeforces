import java.util.Arrays;
import java.util.Scanner;

public class InterestingDrink {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        Arrays.sort(x);
        /*int[] r=new int[1000000000];
        for (int i = 0; i < 1000000000 ; i++) {
            r[i]=-1;
        }*/
        int q = scanner.nextInt();
        int[] m = new int[q];
        for (int i = 0; i < q; i++) {
            m[i] = scanner.nextInt();
            int shop=Arrays.binarySearch(x,m[i]);
            System.out.println(shop+1);
        }
    }
}
