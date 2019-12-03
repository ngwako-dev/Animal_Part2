import java.util.ArrayList;

public class Home {

    ArrayList<Animal> list = new ArrayList<Animal>();

    public void adoptpet(Animal pet) {
        list.add(pet);
    }

    public void makeAllsound() {

        for (Animal a : list) {
            a.sound();
        }
    }
}