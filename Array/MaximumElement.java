import java.util.Scanner;
public class MaximumElement {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter the elements of "+n+" size: ");
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		int max= arr[0];
		for(int i=0; i<n; i++){
			if(arr[i]>max) max=arr[i];
		}
		System.out.print("Maximum element in the array is: "+max);
	}
}