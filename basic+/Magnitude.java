import java.util.Scanner;
public class Magnitude{
	public static void main(Sring[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		if(n<0){
			n=-n;
		}
		if(n>69){
			System.out.println(n+" greater than 69");
		} else if(n<69){
			System.out.println(n+" smaller than 69");
		} else {
			System.out.println("Both Magnitudes are same.");
		}
	}
}