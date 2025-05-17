import java.util.Arrays;
import java.util.Scanner;

public class BussinessTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] a = new int[12];
        for (int i = 0; i < 12; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int min = 0 , s = 0;
        for (int i=11; s < k && i>=0 ; min++,i--) {
            s += a[i];
        }
        if(s>=k) System.out.println(min);
        else System.out.println(-1);
    }
}
