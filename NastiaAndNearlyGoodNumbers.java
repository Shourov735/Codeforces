import java.util.Scanner;

public class NastiaAndNearlyGoodNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(b==1) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
                System.out.println(a+" "+a*(long)b+" "+a*(long)(1+b));
            }
        }
    }
}