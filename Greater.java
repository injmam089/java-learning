import java.util.*;

public class Greater {
    static int greater(int a, int b) {
        if(a > b)
            return a;
        else
            return b;
    }
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = greater(x, y);
        System.out.println("Greater number = " + result);
    }
}
