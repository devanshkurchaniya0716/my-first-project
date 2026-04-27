import java.util.Scanner;

public class Age {
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter birth year: ");
        int birth = sc.nextInt();

        System.out.print("Enter current year: ");
        int current = sc.nextInt();

        int age = current - birth;
        System.out.println("Your Age = " + age);
    }
}