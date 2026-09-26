import java.util.Scanner;
public class Abcd{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num= sc.nextInt();
		boolean x=num%5==0;
		boolean y=num%3==0;
		if(x && y){
			System.out.println("C");
		} else if(x){
			System.out.println("A");
		} else if(y){
			System.out.println("B");
		} else{
			System.out.println("D");
		}
	}
}