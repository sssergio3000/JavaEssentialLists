package friends;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = Friends.friendsList();
        Collections.sort(list);

        for (String fr: list
             ) {
            System.out.println(fr);

        }



    }
}
