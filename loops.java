
import java.util.Scanner;
public class loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :- ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {          // rows
            for (int j = 1; j <= i; j++) { 
               System.out.print("*");
               }
            System.out.println();     
            }
        } 
}         // new line after each row