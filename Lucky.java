import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        String ticket;
        for (int i = 0; i < t; i++) {
            ticket=scanner.next();
            byte[] digit=ticket.getBytes(StandardCharsets.UTF_8);
            for (int j = 0; j < digit.length ; j++) {
                digit[j]-=48;
            }
            if((digit[0]+digit[1]+digit[2])==(digit[3]+digit[4]+digit[5])) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

    }
}
