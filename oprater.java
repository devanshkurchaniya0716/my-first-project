import java.util.Scanner;

public class oprater{
    public static void main(String[] age){
        Scanner sc = new Scanner(System.in);

        System.out.print("Have you id card (YES OR NO):");
        String card = sc.next();
        if(card.equalsIgnoreCase("YES")) {
            System.out.print("you are enter in the collage");
        }
        else{
            System.out.print("you are not enter in collage");
        }
    }
}


