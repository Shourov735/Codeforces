import java.util.Scanner;

public class OddDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long num;
        for (int i = 0; i < t; i++) {
            num=scanner.nextLong();
            //double pow=Math.log(num)/Math.log(2);
            //if(Math.floor(pow) == pow) System.out.println("NO");
            if((num & (num-1))==0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
