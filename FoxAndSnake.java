import java.util.Scanner;

public class FoxAndSnake{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		int k=0;
		for(int i=1;i<=n;i++){
			if(i%2==1){
				for(int j=1;j<=m;j++){
					System.out.print("#");
				}
				System.out.println();
			}
			else{
				if(k%2==1) {
					System.out.print("#");
				}
				for(int j=1;j<m;j++){
					System.out.print(".");
				}
				if(k%2==0){
					System.out.print("#");
				}
				k++;
				System.out.println();
			}
		}
	}
}