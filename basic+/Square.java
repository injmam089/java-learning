import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int s = i * i;
        System.out.println("Square of " + i + " is " + s);
    }
}