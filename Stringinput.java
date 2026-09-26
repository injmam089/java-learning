import java.util.*;
public class StringInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String name = sc.nextLine();

        // Output
        System.out.println("You entered: " + name);

        sc.close();
    }
}   