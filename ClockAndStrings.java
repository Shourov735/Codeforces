import java.util.Scanner;

public class ClockAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            if(((Math.min(a,b) < c && c < Math.max(a,b)) || (Math.min(a,b) < d && d < Math.max(a,b) )) &&
                    ((Math.min(c,d) < a && a < Math.max(c,d)) || (Math.min(c,d) < b && b < Math.max(c,d) ))) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}