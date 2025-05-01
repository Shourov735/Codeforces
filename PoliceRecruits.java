import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int police,crime;
        police=crime=0;
        for (int i = 0; i < n; i++) {
            int p=scanner.nextInt();
            if(police<0) police=0;
            police+=p;
            if(police<0) crime++;
        }
        System.out.print(crime);
    }
}
