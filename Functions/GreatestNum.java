import java.util.Scanner;
//import java.util.Math;

public class GreatestNum{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter first number: ");
	int a=sc.nextInt();
	System.out.print("Enter second number: ");
	int b=sc.nextInt();
	System.out.print("Enter third number: ");
	int c=sc.nextInt();
	System.out.print("Enter forth number: ");
	int d=sc.nextInt();
	System.out.println("Maximum of all numbers is: "+Math.max(Math.max(Math.max(a,b),c),d));
	}
}
