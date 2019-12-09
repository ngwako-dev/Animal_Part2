public class Cat extends Animal{

    private static String name="Storm";

    public Cat(){
        super(name);
    }

    public String sound(){
        return "Meow";
    }
}