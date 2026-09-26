import java.util.Scanner;
public class SumOfElements {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum=0;
		System.out.print("Enter the elements: ");
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0; i<n; i++){
			sum += arr[i];
		}
		System.out.print("The sum of all elements are: "+sum);
	}
}

/* 
import java.util.Scanner;
public class ProductOfElements {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int product=1;
		System.out.print("Enter the elements: ");
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0; i<n; i++){
			product = product*arr[i];
		}
		System.out.print("The product of all elements are: "+product);
	}
}
*/