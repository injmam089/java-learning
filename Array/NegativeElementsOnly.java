import java.util.Scanner;
public class NegativeElementsOnly {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int x=sc.nextInt();
		int[] arr=new int[x];
		//for insert
		System.out.print("Enter the elements: ");
		for(int i=0; i<x;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<x; i++){
			if(arr[i]<0) System.out.print(arr[i]+" ");
		}
	}
}