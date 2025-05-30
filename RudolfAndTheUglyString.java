import java.util.Scanner;

public class RudolfAndTheUglyString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int remove = 0;
            StringBuffer sb = new StringBuffer(scanner.next());
            int index = sb.indexOf("pie");
            while(index!=-1){
                sb.deleteCharAt(index+1);
                index = sb.indexOf("pie");
                remove++;
            }
            index = sb.indexOf("map");
            while(index!=-1){
                sb.deleteCharAt(index+1);
                index = sb.indexOf("map");
                remove++;
            }
            System.out.println(remove);
        }
    }
}