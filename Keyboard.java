import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char lr = scanner.next().charAt(0);
        String str = scanner.next();
        String real = "qwertyuiopasdfghjkl;zxcvbnm,./";
        int length = str.length();
        if (lr == 'R') {
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < 30; j++) {
                    if(str.charAt(i)==real.charAt(j)){
                        System.out.print(real.charAt(j-1));
                        break;
                    }
                }
            }
        }
        else if (lr=='L') {
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < 30; j++) {
                    if(str.charAt(i)==real.charAt(j)){
                        System.out.print(real.charAt(j+1));
                        break;
                    }
                }
            }
        }
    }
}
