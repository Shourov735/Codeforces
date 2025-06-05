import java.util.Scanner;

public class Stripes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String[] s = new String[8];
            char ans = 'B';
            for (int i = 0; i < 8; i++) {
                s[i] = scanner.next();
                if(s[i].equals("RRRRRRRR")) ans = 'R';
            }
            System.out.println(ans);
        }
    }
}