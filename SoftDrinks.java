import java.util.Scanner;

public class SoftDrinks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int l=scanner.nextInt();
        int c=scanner.nextInt();
        int d=scanner.nextInt();
        int p=scanner.nextInt();
        int nl=scanner.nextInt();
        int np=scanner.nextInt();
        int x=(k*l)/nl;
        int y=c*d;
        int z=p/np;
        int xy=Integer.min(x,y);
        System.out.print(Integer.min(xy,z)/n);
    }
}
