import java.util.Scanner;

public class Chemistry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            String s = scanner.next();
            int[] a = new int[26];
            for (int j = 0; j < n; j++) {
                a[s.charAt(j)-'a']++;
            }
            int odd=0;
            for (int j = 0; j < 26; j++) {
                if(a[j]%2==1) odd++;
            }
            System.out.println(odd<=k+1?"YES":"NO");
        }
    }
}
