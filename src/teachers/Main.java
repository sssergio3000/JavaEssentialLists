package teachers;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> tchrs = new ArrayList<>();

        tchrs.add("Marija Stepanovna");
        tchrs.add("Ljudmila Petrovna");
        tchrs.add("Stefania Fedorovna");
        tchrs.add("Margarita Kirilovna");
        tchrs.add("Oleg Sergeevich");
        tchrs.add("Anna Michajlovna");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter best teacher name: ");
        String bt = scan.nextLine();
        System.out.println("Enter worst teacher name: ");
        String wt = scan.nextLine();

        int btindx = tchrs.indexOf(bt);
        int wtindx = tchrs.indexOf(wt);

        System.out.println("Best teacher is: "+ tchrs.get(btindx));
        System.out.println("Worst teacher is: "+ tchrs.get(wtindx));


    }


}
