import java.util.Scanner;
public class Sum{
	public static void main (String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first Number: ");
		int x=sc.nextInt();
		System.out.print("Enter Second Number: ");
		int y=sc.nextInt();
		int z = x+y;
		System.out.print("Sum of "+x+" and "+y+" = "+z);
	}
}