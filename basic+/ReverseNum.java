// program of reverse number, and sum of original number and reversed number
import java.util.Scanner;
public class ReverseNum{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int x=n;
		int r=0;
		int y=0;
		while(n != 0){
			y=y+n%10;
			r=r*10;
			r=r+(n%10);

			n=n/10;
		}
		System.out.println("the number is : "+x);
		System.out.println("Reversed number is: "+r);
		System.out.println("Sum of number and reversed number is: "+(x+r));
	}
}