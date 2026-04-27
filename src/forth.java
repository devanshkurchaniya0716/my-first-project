import java.util.Scanner;
public class forth{

    public static String myname(String name){
        return name;
    }
    public static void main(String[] argu){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter your name:");
        String name = sc .next();
        System.out.print("YOUR NAME IS "+name);
    }

}