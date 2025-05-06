import java.util.Scanner;

public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for(int i = 0; i < t; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int moves = Math.abs(a - b);
            if (moves%10 == 0) System.out.println(moves/10);
            else System.out.println(moves/10 + 1);

        }
    }
}
