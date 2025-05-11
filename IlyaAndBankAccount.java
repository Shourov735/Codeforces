import java.util.Scanner;

public class IlyaAndBankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n>0) System.out.println(n);
        else{
            int m=Math.abs(n);
            if(m%10 > (m/10)%10) System.out.println(n/10);
            else System.out.println(n%10 + (n/100)*10);
        }
    }
}
