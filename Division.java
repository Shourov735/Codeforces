import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        int rating;
        for (int i = 0; i < t; i++) {
            rating=scanner.nextInt();
            if(rating<=1399) System.out.println("Division 4");
            else if (rating<=1599) System.out.println("Division 3");
            else if (rating<=1899) System.out.println("Division 2");
            else System.out.println("Division 1");
        }
    }
}
