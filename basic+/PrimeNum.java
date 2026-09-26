import java.util.Scanner;
public class PrimeNum{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		boolean flag=true;
		for(int i=2; i<=n-1;i++){
			if(n%i==0){
			flag=false;
			break;
			}
		}
		if(flag==false){
			System.out.println(n+" is a Composite number");
		} 
		if(flag==true){
			System.out.println(n+" is a Prime number");
		}
	}
}