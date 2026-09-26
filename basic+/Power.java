import java.util.Scanner;
public class Power{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter base: ");
		int a=sc.nextInt();
		System.out.print("Enter power: ");
		int b=sc.nextInt();
		int p=1;
		for(int i=1; i<=b; i++){
			p=p*a;
		}
		System.out.println(p);
	}
}