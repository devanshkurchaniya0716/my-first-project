import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Square
        System.out.print("Enter side: ");
        double s = sc.nextDouble();
        System.out.println("Perimeter of Square = " + (4 * s));

        // Rectangle
        System.out.print("Enter length ");
        double l = sc.nextDouble();
        System.out.print("enter the width:");
        double w = sc.nextDouble();
        System.out.println("Perimeter of Rectangle = " + (2 * (l + w)));

        // Circle
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Circumference = " + (2 * 3.14 * r));
    }
}
