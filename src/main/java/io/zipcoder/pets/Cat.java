package io.zipcoder.pets;

/**
 * Created by christopherworsley on 9/26/16.
 */
public class Cat extends Pet{
    private String speak = "Meow";

    public Cat(String name){
        super.petName = name;

    }


    @Override
    public String speak() {
        return speak;
    }

    @Override
    public String toString(){
        return String.format("The pets name is "+petName+ " It's a "+super.typeOfPet+"and it says "+speak());
    }
}
