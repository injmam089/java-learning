import java.util.Scanner;
public class AddAndMultiplyInIndexes{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=sc.nextInt();
		int[] arr= new int[n];
		System.out.print("Enter the elements: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<n; i++){
			if(i%2==0) arr[i]=arr[i]+10;
			else arr[i]=arr[i]*2;
			System.out.print(arr[i]+" ");
		}

	}
}