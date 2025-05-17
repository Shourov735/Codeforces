import java.util.Scanner;

public class ZeroOneGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String s = scanner.next();
            int one=0;
            int n = s.length();
            for (int j = 0; j < n; j++) {
                if(s.charAt(j)=='1') one++;
            }
            int moves=Math.min(one,n-one);
            if(moves%2==0) System.out.println("NET");
            else System.out.println("DA");

        }
    }
}
