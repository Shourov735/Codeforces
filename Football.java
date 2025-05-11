import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s1 = 0, s2 = 0, first = 0;
        String str1 = "", str2 = "";
        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            if (first == 0) {
                str1 = str;
                first = 1;
            }
            if (str.equals(str1)) s1++;
            else {
                if (first == 1) {
                    str2 = str;
                    first = 2;
                }
                if (str.equals(str2)) s2++;
            }
        }
        System.out.print(s1 > s2 ? str1 : str2);
    }
}
