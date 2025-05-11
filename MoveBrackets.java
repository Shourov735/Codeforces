import java.util.Scanner;

public class MoveBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int bracket =0,moves=0;
            for (int j = 0; j < n ; j++) {
                if(s.charAt(j)=='(') bracket++;
                else bracket--;
                if(bracket < 0) {
                    moves++;
                    bracket = 0;
                }
            }
            System.out.println(moves);
        }
    }
}
