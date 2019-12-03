import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test

    void TestDogEats(){
        assertEquals("Food",Dog.eat());//test pass
//        assertEquals("Meat",Dog.eat());//This test fails
    }
    @Test
    void TestCatEats(){
        assertEquals("Food",Cat.eat());//Test pass
//        assertEquals("Meat",Cat.eat());//This test fails
    }

}
class CatTest{
    @Test
    void TestDogSound(){
        assertEquals("barks",Dog.sound());//This test pass
//        assertEquals("Meow",Dog.sound());//This test fails
    }

    @Test
    void TestCatSound(){
        assertEquals("Meow",Cat.sound());//This test pass
//        assertEquals("bark",Cat.sound());//This test fails
    }
}



