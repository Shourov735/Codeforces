import java.util.Scanner;

public class RaisingBacteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum=0,k=0;
        for (int i = x ; sum!=x ; i--) {
            if((i & (i-1))==0 && sum+i <= x) {
                sum = sum + i;
                k++;
            }
        }
        System.out.println(k);
    }
}
