import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String code = scanner.next();
        for (int i = 0; i < code.length(); i++) {
            if(code.charAt(i)=='-' && code.charAt(i+1)=='-') {
                System.out.print(2);
                i++;
            }
            else if(code.charAt(i)=='-' && code.charAt(i+1)=='.') {
                System.out.print(1);
                i++;
            }
            else if(code.charAt(i)=='.') System.out.print(0);
        }
    }
}
