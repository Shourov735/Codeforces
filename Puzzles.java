import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int min=2000;
        int[] f=new int[m];
        for (int i = 0; i < m; i++) {
            f[i]=scanner.nextInt();
        }
        Arrays.sort(f);
        for (int i = n-1; i < m; i++) {
            int differance=f[i]-f[i+1-n];
            if (differance < min) {
                min=differance;
            }

        }
        //for(int x:f) System.out.print(x+" ");
        System.out.println(min);
    }
}
