import java.util.Arrays;
import java.util.Scanner;

public class DistinctSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int[][] charnumA =new int[n][26];
            int[][] charnumB =new int[n][26];
            int[] disCharA = new int[n];
            int[] disCharB = new int[n];
            charnumA[0][s.charAt(0)-'a']++;
            for (int i = 1; i < n; i++) {
                charnumA[i]= Arrays.copyOf(charnumA[i-1],26);
                charnumA[i][s.charAt(i)-'a']++;
                for (int j = 0; j < 26; j++) {
                    if(charnumA[i][j]>0) disCharA[i]++;
                }
            }
            charnumB[0]=Arrays.copyOf(charnumA[n-1],26);
            charnumB[0][s.charAt(0)-'a']--;
            for (int j = 0; j < 26; j++) {
                if(charnumA[0][j]>0) disCharA[0]++;
                if(charnumB[0][j]>0) disCharB[0]++;
            }
            int max = disCharA[0]+disCharB[0];
            for (int i = 1; i < n; i++) {
                charnumB[i]=Arrays.copyOf(charnumB[i-1],26);
                charnumB[i][s.charAt(i)-'a']--;
                for (int j = 0; j < 26; j++) {
                    if(charnumB[i][j]>0) disCharB[i]++;
                }
                if((disCharA[i]+disCharB[i])>max) max = disCharA[i]+disCharB[i];
            }
            System.out.println(max);
        }
    }
}
