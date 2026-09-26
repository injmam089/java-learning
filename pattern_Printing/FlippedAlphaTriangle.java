import java.util.Scanner;
public class FlippedAlphaTriangle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int a=n;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=a; j++){
				System.out.print((char)(j+96)+" ");
			}
			a--;
			System.out.println();
		}
	}
}