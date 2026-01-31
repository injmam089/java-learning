import java.util.*;

public class avg{
    static void average(int a, int b, int c) {
        double avg = (a + b + c) / 3.0;
        System.out.println("Average = " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        average(x, y, z);
    }
}