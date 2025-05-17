import java.util.Scanner;

public class TwoGram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        String maxsubstr="" ;
        int max = 0;
        for (int i = 0; i < n-1; i++) {
            String substr = str.substring(i,i+2);
            int count=0;
            int index=0;
            while((index=str.indexOf(substr,index))!=-1){
                count++;
                index+=1;
            }
            if(count>max) {
                max = count;
                maxsubstr = substr;
            }
        }
        System.out.println(maxsubstr);
    }
}
