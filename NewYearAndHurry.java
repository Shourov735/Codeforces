import java.util.Scanner;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int max=n;
        for (int i = 1; i<=n ; i++) {
            k=k+5*i;
            if(k>240){
                max=i-1;
                break;
            }
        }
        System.out.println(max);
    }
}
