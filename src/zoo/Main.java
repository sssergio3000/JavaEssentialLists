package zoo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList animal = Zoo.animal();


        for (Object anim: animal) {
            System.out.println(anim);
        }


    }//main
}//Main
