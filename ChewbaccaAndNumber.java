import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            int digit = c - '0';
            int inverted = 9 - digit;

            if (i == 0 && digit == 9) {
                result.append('9');  // Don't invert leading 9
            } else {
                result.append((char) ('0' + Math.min(digit, inverted)));
            }
        }
        System.out.println(result);
    }
}

