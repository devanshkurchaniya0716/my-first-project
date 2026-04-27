import java.util.Scanner;
public class ifelse {
    public static void main(String[] argu){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age::");
        int a = sc.nextInt();
        if(a>=18){
            System.out.print("you are ELIGIBLE ");
        }
        else{
            System.out.print("you are NOT ELIGIBLE ");

        }
    }
}
