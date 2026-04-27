import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  choice;
        System.out.println("===================================================");
        System.out.println("\t CALCULATOR");
        System.out.println("===================================================");
        System.out.println("\t 1  addition:");
        System.out.println("\t 2 substracting:");
        System.out.println("\t 3 multiplaction:");
        System.out.println("\t 4  divisoin:");
        System.out.println("\t 5  exit:");
        System.out.print("enter your choice:");
        System.out.println("===================================================");

        choice = sc  . nextInt();

        switch(choice) {
            case 1:
                System.out.println("first number:");
                int a = sc.nextInt();
                System.out.println("second number:");
                int b = sc.nextInt();
                System.out.println("your answer is =" +(a+b));
                break;
            case 2:
                System.out.println("first number:");
                int x = sc.nextInt();
                System.out.println("second number:");
                int y = sc.nextInt();
                System.out.println("your answer is=" +(x-y));
                break;
            case 3 :
                System.out.println("first number:");
                int u= sc.nextInt();
                System.out.println("second number:");
                int v = sc.nextInt();
                System.out.println("your answer is" +(v*u));
                break;
            case 4 :
                System.out.println("first number:");
                int p = sc.nextInt();
                System.out.println("second number:");
                int q = sc.nextInt();
                System.out.println("your answer is" +(p/q));
                break;
            case 5:
                System.out.println("Thank you to visit my calculater");
                break;

        }

    }
}