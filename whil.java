import java.util.Scanner;

public class whil {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int number;
        int digit;
        int reverse = 0;

        System.out.print("enter the number");
        number  = sc .nextInt();

        int temp = number;

        while(number != 0){
            digit = number % 10;
            number = number / 10;
           System.out.println(digit);
            reverse = reverse * 10 + digit;
        }
        System.out.println("the number is :"+temp);

        System.out.println("Reverse number is"+reverse);

        if(temp == reverse){
            System.out.print("palindron number");


        }
        else{
            System.out.print("not palindron");

        }

    }
}
