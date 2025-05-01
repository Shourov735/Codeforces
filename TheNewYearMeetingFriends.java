import java.util.Arrays;
import java.util.Scanner;

public class TheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] position=new int[3];
        position[0]=scanner.nextInt();
        position[1]=scanner.nextInt();
        position[2]=scanner.nextInt();
        Arrays.sort(position);
        //(position[1]-position[0]+position[2]-position[1])  =  position[2]-position[0];
        System.out.print(position[2]-position[0]);
    }
}
