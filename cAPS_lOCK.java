import java.util.Scanner;

public class cAPS_lOCK {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        String substr=str.substring(1);
        boolean x=str.equals(str.toUpperCase());
        if(x){
            System.out.print(str.toLowerCase());
            return;
        }
        x=substr.equals(substr.toUpperCase());
        if(x){
            System.out.print(str.substring(0,1).toUpperCase()+substr.toLowerCase());
            return;
        }
        System.out.print(str);
    }
}
