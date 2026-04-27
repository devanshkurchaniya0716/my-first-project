import java.util.Scanner;

public class atmstrong {
    public static void main(String[] args){
        int number;
        int digit;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        number  = sc .nextInt();

        int temp = number;

        while(number != 0){
            digit = number % 10;
            number = number / 10;
            sum = sum + digit*digit*digit;

        }
        if(temp == sum){
            System.out.print("Atmstrong");
        }
        else{
            System.out.print("not Atmstrong");


        }
    }

}
