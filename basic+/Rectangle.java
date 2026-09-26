import java.util.Scanner;
public class Rectangle{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");
		int l=sc.nextInt();
		System.out.print("Enter breadth: ");
		int b=sc.nextInt();
		int area=l*b;
		int parameter=2*(l+b);
		if(area>parameter){
			System.out.println("Area is greater than parameter");
		} else {
			System.out.println("Area is smaller than parameter");
		}
	}
}