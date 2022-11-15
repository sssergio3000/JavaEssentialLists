package iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add(i);
            System.out.println(intList.get(i));
        }
        System.out.println("_____________");
        ListIterator<Integer> intListIterator = intList.listIterator();
        while (intListIterator.hasNext()) {
            Integer int1 = intListIterator.next() + 1;
            intListIterator.set(int1);
        }//while

        for (Integer intOut: intList ) {
            System.out.println(intOut);

        }


    }//main
}//class Main
