import java.util.Scanner;

public class MagicNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        boolean check = true;
        for (int i = 0; i < n.length();) {
            if((i + 2 < n.length()) && n.charAt(i) == '1' && n.charAt(i+1) == '4' && n.charAt(i+2) == '4')  i += 3;
            else if((i + 1 < n.length()) && n.charAt(i) == '1' && n.charAt(i+1) == '4') i += 2;
            else if(n.charAt(i) == '1') i++;
            else {
                check = false;
                break;
            }
        }
        if(check) System.out.println("YES");
        else System.out.println("NO");
    }
}
