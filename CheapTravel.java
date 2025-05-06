import java.util.Arrays;
import java.util.Scanner;

public class CheapTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] min=new int[3];
        min[0]=n*a;
        min[1]=n/m * b + n%m * a;
        min[2]=(n/m +1) *b;
        Arrays.sort(min);
        System.out.println(min[0]);
    }
}
