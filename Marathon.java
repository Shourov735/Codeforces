import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            int c= scanner.nextInt();
            int d= scanner.nextInt();
            int inFront=0;
            if(b>a) inFront++;
            if(c>a) inFront++;
            if(d>a) inFront++;
            System.out.println(inFront);
        }
    }
}
