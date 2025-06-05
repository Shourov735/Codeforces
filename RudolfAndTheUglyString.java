import java.util.Scanner;

public class RudolfAndTheUglyString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int remove = 0;
            String s = scanner.next();
            for (int i = 0; i < n-2 ; ) {
                String sub = s.substring(i,i+3);
                if(sub.equals("map") || sub.equals("pie")) {
                    remove++;
                    i+=3;
                } else {
                    i++;
                }
            }
            System.out.println(remove);
        }
    }
}