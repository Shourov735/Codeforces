import java.util.Scanner;

public class I_Love_Username {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int point,max,min,amazing=0;
        max=min=point=scanner.nextInt();
        for (int i = 1; i < n; i++) {
            point=scanner.nextInt();
            if(point>max) {
                amazing++;
                max=point;
            }
            else if(point<min) {
                amazing++;
                min=point;
            }
        }
        System.out.print(amazing);
    }
}
