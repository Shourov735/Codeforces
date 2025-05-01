import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t= scanner.nextInt();
        int[] num=new int[3];
        for (int i = 0; i < t; i++) {
            num[0] =scanner.nextInt();
            num[1] =scanner.nextInt();
            num[2] =scanner.nextInt();
            Arrays.sort(num);
            if(num[0]+num[1]==num[2]) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
