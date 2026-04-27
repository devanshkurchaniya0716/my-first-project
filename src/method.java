import java.util.ArrayList;

public class method {
    public static void main(String[] args) {

        // create arraylist
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(35);
        numbers.add(20);
        numbers.add(2123);
        numbers.add(49);
        numbers.add(78);
        numbers.add(767);
        numbers.add(77);

        ArrayList<Integer> divisibles = new ArrayList<>();

        // printing original list
        System.out.println(numbers);

        // logic: numbers divisible by 7
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 7 == 0) {
                divisibles.add(numbers.get(i));
            }
        }

        // printing result
        System.out.println(divisibles);
    }
}

