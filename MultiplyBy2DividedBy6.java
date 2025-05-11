import java.util.Scanner;

public class MultiplyBy2DividedBy6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int by3=0,by6=0;
            while (n>=3){
                if(n%6==0){
                    n/=6;
                    by6++;
                } else if (n%3==0) {
                    n/=3;
                    by3++;
                }
                else break;
            }
            if(n==1) System.out.println(by6+2*by3);
            else System.out.println(-1);
        }
    }
}
