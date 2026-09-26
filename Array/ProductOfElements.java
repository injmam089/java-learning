import java.util.Scanner;
public class ProductOfElements {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] arr= new int[4];
		int product= 1;
		
		System.out.print("Enter the elements: ");
		for(int i=0; i<4; i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0; i<4; i++){
			product = product*arr[i];
		}
		System.out.print("The product of all elements are: "+product);
	}
}