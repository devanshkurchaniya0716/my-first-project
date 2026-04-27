import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();
        double rectArea = length * width;
        System.out.println("Area of Rectangle = " + rectArea);

        // Square
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        double squareArea = side * side;
        System.out.println("Area of Square = " + squareArea);

        // Triangle
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();
        double triangleArea = 0.5 * base * height;
        System.out.println("Area of Triangle = " + triangleArea);

        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + circleArea);

        
    }
}

