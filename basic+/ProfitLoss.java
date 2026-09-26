import java.util.Scanner;
public class ProfitLoss{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter cost price: ");
		int c=sc.nextInt();
		System.out.print("Enter selling price: ");
		int s=sc.nextInt();
		double profit=(double)(s-c)/c*100;
		double loss=(double)(c-s)/c*100;
		if(c<s){
			System.out.println("You are in profit by "+profit+"%");
		} else if(c>s){
			System.out.println("You are in loss by "+loss+"%");
		} else {
			System.out.println("you made no profit no loss");
		}
	}
}