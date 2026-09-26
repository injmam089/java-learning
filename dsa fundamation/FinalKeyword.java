public class FinalKeyword{
	public static void main(String []args){	
		Random r1=new Random();
		System.out.println(r1.PI);
		final int x;
		x=4;
		System.out.println(x);
	}
}
class Random{
	static final double PI;
	static{
		PI=3.14;
	}
}