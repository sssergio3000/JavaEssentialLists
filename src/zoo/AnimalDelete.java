package zoo;




import java.util.ArrayList;

public class AnimalDelete {
    public static void main(String[] args) {
        ArrayList animalsForDelete = Zoo.animal();
        System.out.println("animalsForDelete initial size:"+animalsForDelete.size());
        animalsForDelete.remove(7);
        animalsForDelete.remove(5);
        animalsForDelete.remove(3);
        System.out.println("animalsForDelete final size:"+animalsForDelete.size());
        System.out.println("_________________");
        System.out.println(animalsForDelete.toString());






    }
}
