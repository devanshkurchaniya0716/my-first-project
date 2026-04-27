 import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int number = sc.nextInt();

        int count = 0;

        for(int i=2;i<=number;i++){
            if(number % i == 0){
                count++;
            }
        }
        if(count==2){
            System.out.println("numbre is prime ");
        }
        else{
            System.out.println("numbre is  not prime ");

        }
    }
}

