import java.util.Scanner;

public class YesOrYes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
        String str=scanner.next().toUpperCase();
        if(str.equals("YES")) System.out.println("YES");
        else System.out.println("NO");
        }
    }
}
