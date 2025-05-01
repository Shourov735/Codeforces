import java.util.Scanner;

public class Dragons {
    public static void main(String[] args) {
        int s ,n;
        Scanner scanner=new Scanner(System.in);
        s=scanner.nextInt();
        n=scanner.nextInt();
        int[] dragon=new int[n];
        int[] bonus=new int[n];
        for (int i = 0; i < n; i++) {
            dragon[i]=scanner.nextInt();
            bonus[i]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(dragon[i]>dragon[j]){
                    int temp=dragon[i];
                    dragon[i]=dragon[j];
                    dragon[j]=temp;
                    temp=bonus[i];
                    bonus[i]=bonus[j];
                    bonus[j]=temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if(s<=dragon[i]){
                System.out.print("NO");
                return;
            }
            s+=bonus[i];
        }
        System.out.print("YES");
    }
}
