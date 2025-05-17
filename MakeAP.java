import java.util.Scanner;

public class MakeAP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            String str = "NO";
            int na = (2*b-c);
            int nb = (a+(c-a)/2);
            int nc = (a+2*(b-a));
            if( nc % c == 0 && nc>=c && nc!=0) str = "YES";
            else if( nb % b == 0 && (c-a)%2==0 && nb>=b && nb!=0) str = "YES";
            else if( na % a ==0 && na>=a && na!=0) str = "YES";
            System.out.println(str);
        }
    }
}
