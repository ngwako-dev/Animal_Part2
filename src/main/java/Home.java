import java.util.ArrayList;

public class Home {

    static ArrayList<Animal> list = new ArrayList<>();

    public static void adoptpet(Animal pet) {
        list.add(pet);
    }

    public static void makeAllsound() {
        for (Animal a : list) {
            System.out.println(a.sound());
        }
    }
}