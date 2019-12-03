public class Cat extends Animal{

    private static String name="Storm";

    public Cat(){
        super(name);
    }

    public static String sound(){
        return "Meow";
    }
}