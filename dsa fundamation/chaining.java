public class chaining{
	public static void main(String []args){
	fun1();
	System.out.println("4");
	}
	static void fun1(){
	fun2();
	System.out.println("3");
	}
	static void fun2(){
	fun3();
	System.out.println("2");
	}
	static void fun3(){
	System.out.println("1");
	
}