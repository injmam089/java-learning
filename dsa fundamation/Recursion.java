public class Recursion{
	public static void main(String []args){
	printNum(3);
	}
	static void printNum(int n){
		if(n==5){
			return;
		}
		printNum(n+1);
		System.out.println(n);
	}
}