import java.util.Scanner;

public class NewYearsNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String s = "NO";
            for (int j = 1 ; n>=j*2020 ; j++) {
                if(n>=j*2020 && n<=j*2021) {
                    s = "YES";
                    break;
                }
            }
            System.out.println(s);
        }
    }
}
