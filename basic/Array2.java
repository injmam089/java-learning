public class Array{
	public static void main(String []args){
		//1D array
		int rollNo[]= new int[3];
		int x=101;
		for(int i=0;i<rollNo.length;i++){
			rollNo[i]=x;
			x++;
		}
		for(int i=0;i<rollNo.length;i++){
			System.out.println(rollNo[i]);
		}
	}
}