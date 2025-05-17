import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] lang1 = new String[m];
        String[] lang2 = new String[m];
        String[] smaller = new String[m];
        String[] lecture = new String[n];
        for (int i = 0; i < m; i++) {
            lang1[i] = scanner.next();
            lang2[i] = scanner.next();
            if(lang2[i].length()<lang1[i].length()) smaller[i]=lang2[i];
            else smaller[i]=lang1[i];
        }
        for (int i = 0; i < n; i++) {
            lecture[i] = scanner.next();
            for (int j = 0; j < m; j++) {
                if(lecture[i].equals(lang1[j]) || lecture[i].equals(lang2[j])) {
                    System.out.print(smaller[j]+" ");
                    break;
                }
            }
        }
    }
}
