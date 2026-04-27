import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        double num = sc.nextDouble();

        System.out.print("Enter percentage: ");
        double per = sc.nextDouble();

        double result = (num * per) / 100;
        System.out.println("Result = " + result);
    }
}