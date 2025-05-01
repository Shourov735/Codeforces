import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        int[] integer=new int[t];
        int[] k=new int[t];
        for (int i = 0; i < t; i++) {
            integer[i]=scanner.nextInt();
            int temp=integer[i];
            while (temp!=0){
                if(temp%10!=0) k[i]++;
                temp/=10;
            }
        }
        for (int i = 0; i < t; i++) {
            String string=String.valueOf(integer[i]);
            int length=string.length();
            System.out.println(k[i]);
            for (int j = 0; j < length; j++) {
                int x=string.codePointAt(length-1-j)-48;
                if(x!=0) System.out.print((int)Math.pow(10,j)*x+" ");
            }
            System.out.println();
        }
    }
}
