package animalDelete;


import zoo.Zoo;

import java.util.ArrayList;

public class AnimalDelete {
    public static void main(String[] args) {
        ArrayList animal2 = Zoo.animal();
        System.out.println("animal2 size before deleting: " +animal2.size());
        animal2.remove("Horse");
        animal2.remove("Penguin");
        animal2.remove("Donkey");
        System.out.println("animal2 size after deleting: " +animal2.size());


    }
}
