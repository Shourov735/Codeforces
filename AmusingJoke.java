import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name1=scanner.next();
        String name2=scanner.next();
        String pile=scanner.next();
        String name=name1+name2;
        if(name.length()!=pile.length()){
            System.out.print("NO");
            return;
        }
        int[] charNum=new int[26];
        int[] pileNum=new int[26];
        int length=name.length();
        for(int i = 0; i < length; i++) {
            charNum[name.codePointAt(i)-65]++;
            pileNum[pile.codePointAt(i)-65]++;
        }
        /*for (int i = 0; i < 26; i++) {
            System.out.println(charNum[i]+" "+pileNum[i]);
        }*/
        if(Arrays.equals(charNum,pileNum)){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
