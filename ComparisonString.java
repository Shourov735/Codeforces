import java.util.Scanner;

public class ComparisonString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int maxg,maxl,currentg,currentl;
            maxg = maxl=currentg=currentl=0;
            for (int i = 0; i < n; i++) {
                if(s.charAt(i)=='>'){
                    currentl=0;
                    currentg++;
                    if(currentg>maxg){
                        maxg=currentg;
                    }
                }
                else {
                    currentg=0;
                    currentl++;
                    if(currentl>maxl){
                        maxl=currentl;
                    }
                }
            }
            System.out.println(Math.max(maxg,maxl)+1);
        }
    }
}
