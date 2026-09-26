import java.util.Scanner;
public class Axis{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter x axis point: ");
		int x=sc.nextInt();
		System.out.print("Enter y axis point: ");
		int y=sc.nextInt();
		if(x==0 && y==0){
			System.out.println("lies on origin");
		} else if(x>0 && y>0){
			System.out.println("lies on 1st Quadrant");
		} else if(x<0 && y>0){
			System.out.println("lies on 2nd Quadrant");
		} else if(x<0 && y<0){
			System.out.println("lies on 3rd Quadrant");
		} else if(x>0 && y<0){
			System.out.println("lies on 4st Quadrant");
		} else if(x==0){
			System.out.println("lies on y axis");
		} else {
			System.out.println("lies on x axis");
		}
	}
}