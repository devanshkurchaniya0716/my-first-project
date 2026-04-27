import java.util.Scanner;

public class thard{
    public static int calculate(int a , int b){
        int tot = a * b ;
        return tot;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the  1 number:");
        int a= sc.nextInt();
        System.out.print("enter the  2 number:");
        int b= sc.nextInt();
        int multi = calculate(a,b);
        System.out.print("sum of two num is "+multi);

    }
}
