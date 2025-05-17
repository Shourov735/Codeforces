import java.util.Scanner;

public class RoadToZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        for (long i = 0; i < t; i++) {
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long min = Math.min(x,y);
            long dollar1 = (x+y-2*min)*a+min*b;
            long dollar2 = (x+y)*a;

            System.out.println(Math.min(dollar1,dollar2));
        }
    }
}
