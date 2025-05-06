import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] card=new int[n];
        int sereja,dima;
        sereja=dima=0;
        for (int i = 0; i < n; i++) {
            card[i]=scanner.nextInt();
        }
        for (int i = 0,k = 1 ; i < n; k++ ) {
            int bigger;
            if(card[i] > card[n-1]) {
                bigger=card[i];
                i++;
            }
            else {
                bigger=card[n-1];
                n--;
            }
            if(k%2==1) sereja+=bigger;
            else dima+=bigger;
        }
        System.out.print(sereja+" "+dima);
    }
}
