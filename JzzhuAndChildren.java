import java.util.ArrayList;
import java.util.Scanner;

public class JzzhuAndChildren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> position = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
            position.add(i + 1);
        }
        int last = a.get(0);
        while (!a.isEmpty()) {
            if (a.get(0) <= m) {
                a.remove(0);
                last = position.get(0);
                position.remove(0);
            } else {
                a.add(a.get(0) - m);
                a.remove(0);
                position.add(position.get(0));
                position.remove(0);
            }
        }
        System.out.println(last);
    }
}
