import java.util.Arrays;
import java.util.Scanner;

public class MediumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] a=new int[3];
        for (int i = 0; i < t; i++) {
            a[0]=scanner.nextInt();
            a[1]=scanner.nextInt();
            a[2]=scanner.nextInt();
            Arrays.sort(a);
            System.out.println(a[1]);
        }
    }
}
