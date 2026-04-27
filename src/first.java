import java.util.Scanner;

public class first{
    public static int calculatesum(int a , int b){
        int tot = a + b ;
        return tot;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the  1 number:");
        int a= sc.nextInt();
        System.out.print("enter the  2 number:");
        int b= sc.nextInt();
        int sum = calculatesum(a,b);
        System.out.print("sum of two num is "+sum);

    }
}