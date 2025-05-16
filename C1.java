import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String moves = scanner.next();
            int x=0,y=0;
            String str="NO";
            x: while(x<=a && y<=b) {
                for (int j = 0; j < n; j++) {
                    if (moves.charAt(j) == 'N') y++;
                    else if (moves.charAt(j) == 'E') x++;
                    else if (moves.charAt(j) == 'S') y--;
                    else if (moves.charAt(j) == 'W') x--;
                    if(x==a && y==b){
                        str="YES";
                        break x;
                    } else if (x==0 && y==0) {
                        break x;
                    }
                }
            }
            System.out.println(str);
        }
    }
}
