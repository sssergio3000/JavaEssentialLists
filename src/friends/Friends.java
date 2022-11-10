package friends;

import java.util.ArrayList;
import java.util.Collections;

public class Friends {
    static public ArrayList<String> friendsList(){
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Vasja");
        friends.add("Petja");
        friends.add("Kolja");
        friends.add("Sasha");
        friends.add("Katja");
        for (String fr: friends
             ) {
            System.out.println(fr);


        }
        System.out.println("");
        System.out.println("Sorted:");
        return friends;

    }
}
