package ArrayList;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        int element= number.get(0);
        System.out.println(number);
        System.out.println(element);
    }
}