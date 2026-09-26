import java.util.Scanner;
public class Following{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of n: ");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++){
			System.out.println(i);
			System.out.println(n);
			n=n-1;
		}
	}
}