import java.util.Scanner;

public class DislikeOfThrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] a = new int[1001];
        for (int i = 1, k = 1; i <= 1000; k++) {
            if (k % 3 == 0 || k % 10 == 3) continue;
            a[i] = k;
            i++;
        }
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            System.out.println(a[n]);
        }
    }
}
