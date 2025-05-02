import java.util.Scanner;

public class ByAShovel {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();
        int r=scanner.nextInt();
        for (int i = 1; i < 10; i++) {
            int total=i*k;
            if(total%10==r||total%10==0){
                System.out.print(i);
                return;
            }
        }
    }
}
