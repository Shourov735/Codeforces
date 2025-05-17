import java.util.Scanner;

public class CaseOfTheZerosAndOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String string = scanner.next();
        int one=0;
        for (int i = 0; i < n; i++) {
            if(string.charAt(i)=='1') one++;
        }
        int zero=n-one;
        System.out.println(Math.abs(one-zero));
    }
}
