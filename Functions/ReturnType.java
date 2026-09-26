public class ReturnType{
	public static int Aalu(){
		System.out.println("gobhi");
		System.out.println("Lauki");
		return 5;
	}
	public static void main(String args[]){
		Aalu(); // only gobhi and lauki will be print, cause we only call function, not their value.
		System.out.println(5+Aalu()); // in this line, gobhi launki and return value will be printed.
	}
}