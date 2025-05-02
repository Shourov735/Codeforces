import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] x=new int[4];
        x[0]=scanner.nextInt();
        x[1]=scanner.nextInt();
        x[2]=scanner.nextInt();
        x[3]=scanner.nextInt();
        Arrays.sort(x);
        System.out.print((x[3]-x[0])+" "+(x[3]-x[1])+" "+(x[3]-x[2]));
    }
}
