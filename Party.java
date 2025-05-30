import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n];
        int[] a = new int[2001];
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
            if(p[i]==-1) a[0]++;
            else a[p[i]]++;
        }
        int groups = 0;
        for (int i = 0; i < 2001; i++) {
            if(a[i]>0) groups++;
        }
        System.out.println(groups);
    }
}