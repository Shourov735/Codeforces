import java.util.Scanner;

public class FollowingTheString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] chars = new int[26];
            while (n-- > 0) {
                int x = scanner.nextInt();
                System.out.print((char)('a'+chars[x]));
                chars[x]++;
            }
            System.out.println();
        }
    }
}
