import java.util.Arrays;
import java.util.Scanner;

public class CutRibbon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[3];
        a[0] = scanner.nextInt();
        a[1] = scanner.nextInt();
        a[2] = scanner.nextInt();
        Arrays.sort(a);
        int max=0,total=0;
        while(total<n){
            total+=a[0];
            max++;
        }
        if(total==n){
            System.out.print(max);
        }
        while(total+a[1]>n){
            total-=a[0];
            max--;
        }
        while(total<n){
            total+=a[1];
            max++;
        }
        if(total==n){
            System.out.print(max);
        }
        while(total+a[2]>n){
            total-=a[1];
            max--;
        }
        while(total<n){
            total+=a[2];
            max++;
        }
        if(total==n){
            System.out.print(max);
        }
    }
}