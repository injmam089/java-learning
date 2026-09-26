import java.util.Scanner;
public class Triangle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first side: ");
		int a=sc.nextInt();
		System.out.print("Enter Second side: ");
		int b=sc.nextInt();
		System.out.print("Enter Third side: ");
		int c=sc.nextInt();
		if(a+b>c && a+c>b && b+c>a){
			System.out.println("Valid sides for triangle.");
		} else {
			System.out.println("Invalid sides for triangle");
		}
	}
}