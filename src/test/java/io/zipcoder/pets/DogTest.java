package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by christopherworsley on 9/28/16.
 */
public class DogTest {
    @Test
    public void speakTest(){
        Dog bob = new Dog("Joey");
        String expected = "Ruufff!!";
        String actual = bob.speak();
        Assert.assertEquals("You should get Billy", expected, actual);

    }
}
