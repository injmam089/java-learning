public class FunOverloading{
	public static void main(String[] args){

	int x= sum(5,9);
	System.out.println(x);

	int y= sum(4,5,9);
	System.out.println(y);

	int z= sum(15.5,56.24);
	System.out.println(z);

	greet("Seraj", 20);

	greet(20, "Seraj");

	fun();
	}

	static int sum(int a, int b){
	return (a+b);
	}

	static int sum(int a, int b, int c){
	return (a+b+c);
	}   //different number of parameters 

	static int sum(double a, double b){
	return (int)(a+b);
	}

	static void greet(String name, int age){
	System.out.println("Hi "+name+"! Your age is "+age);
	return;
	}

	static void greet(int age, String name){
	System.out.println("Hi "+name+"! Your age is "+age);
	return;
	}

	static void fun(){
	System.out.println("Hello");
	return;
	}
}