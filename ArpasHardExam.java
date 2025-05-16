import java.util.Scanner;

public class ArpasHardExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n==0) {
            System.out.println(1);
            return;
        }
        int r = n % 4;
        if(r==0) System.out.println(6);
        else if (r==1) System.out.println(8);
        else if (r==2) System.out.println(4);
        else if (r==3) System.out.println(2);
    }
}
