package io.zipcoder.pets;

import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by christopherworsley on 9/26/16.
 */
public class PetTest {

    @Test
    public void SpeakTest(){
        Dog joe = new Dog("Joey");
        String expected = "Ruufff";
        String actual = joe.speak();
        Assert.assertEquals("You should receive Joey", expected, actual);
    }
    @Test
    public void GetNameTest(){
        Dog joe = new Dog("Joey");
        String expected = "Joey";
        String actual = joe.getPetName();
        Assert.assertEquals("You should receive Joey", expected, actual);
    }



}
