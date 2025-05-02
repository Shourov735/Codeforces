import java.util.Scanner;

public class VaysaTheHipster {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.print(Math.min(a,b)+" "+(Math.abs(a-b)/2));
    }
}
