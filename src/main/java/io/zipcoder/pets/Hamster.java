package io.zipcoder.pets;

/**
 * Created by christopherworsley on 9/26/16.
 */
public class Hamster extends Pet{
    private String Speak = "yahh";

    public Hamster(String petName) {
        super.petName = petName;

    }

    @Override
    public String speak(){
        return speak();
    }
    @Override
    public String toString(){
        return String.format("This pets name is "+petName+ " and it goes "+speak());
    }

}
