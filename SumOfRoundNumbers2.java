import java.util.Scanner;

public class SumOfRoundNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] k = new int[5];
        int index, p,n;
        for (int i = 0; i < t; i++) {
            n = scanner.nextInt();
            for (index = 0, p = 1; n > 0; p *= 10, n /= 10) {
                int x = p * (n % 10);
                if (x != 0) k[index++] = x;
            }
            System.out.println(index);
            for (int j = 0; j < index; j++) {
                System.out.print(k[j]+" ");
            }
            System.out.println();
        }
    }
}
