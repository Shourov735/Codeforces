import java.util.Scanner;

public class ManhattanCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            String[] dimension = scanner.nextLine().split(" ");
            int n = Integer.parseInt(dimension[0]);
            int m = Integer.parseInt(dimension[1]);

            char[][] c = new char[n][m];
            int a = 0, A = m, b = 0;
            boolean first = true;

            for (int j = 0; j < n; j++) {
                String line = scanner.nextLine();
                for (int k = 0; k < m; k++) {
                    c[j][k] = line.charAt(k);
                    if (c[j][k] == '#') {
                        if (first) {
                            b = k;
                            first = false;
                        }
                        if (k < A) {
                            a = j;
                            A = k;
                        }
                    }
                }
            }
            System.out.println((a + 1) + " " + (b + 1));
        }
        scanner.close();
    }
}
