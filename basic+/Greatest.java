import java.util.Scanner;
public class Greatest{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first Number: ");
		int x=sc.nextInt();
		System.out.print("Enter second Number: ");
		int y=sc.nextInt();
		System.out.print("Enter third Number: ");
		int z=sc.nextInt();
		// If else conditional statement
		/*if(x>=y){
			if(x>=z){
				System.out.println(x);
			} else {
				System.out.println(z);
			}
		} else {
			if(y>=z){
				System.out.println(y);
			} else {
				System.out.println(z);
			}
		}*/
		// Ternary operator
		System.out.println((x>y) ? ((x>z) ? x : z) : ((y>z) ? y : z));
	}
}