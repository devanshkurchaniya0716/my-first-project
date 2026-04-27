import java.util.Scanner;

public class ftoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in F: ");
        double f = sc.nextDouble();

        double c = (f - 32) * 5 / 9;
        System.out.println("Temperature in C = " + c);
    }
}