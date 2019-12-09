import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test

    void TestDogEats(){
        Dog dog=new Dog();
        assertEquals("Food",dog.eat());//test pass
//        assertEquals("Meat",Dog.eat());//This test fails
    }
    @Test
    void TestCatEats(){
        Cat cat=new Cat();
        assertEquals("Food",cat.eat());//Test pass
//        assertEquals("Meat",Cat.eat());//This test fails
    }

}
class CatTest{
    @Test
    void TestDogSound(){
        Dog dog=new Dog();
        assertEquals("barks",dog.sound());//This test pass
//        assertEquals("Meow",Dog.sound());//This test fails
    }

    @Test
    void TestCatSound(){
        Cat cat =new Cat();

        assertEquals("Meow",cat.sound());//This test pass
//        assertEquals("bark",Cat.sound());//This test fails
    }
}



