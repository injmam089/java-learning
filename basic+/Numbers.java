import java.util.Scanner;
public class Numbers{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number: ");
	int x=sc.nextInt();
		if(x>0){
			System.out.println(x);
		} else {
			System.out.println(-x);
		}
	}
}