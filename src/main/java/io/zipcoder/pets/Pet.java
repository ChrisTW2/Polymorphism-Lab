package io.zipcoder.pets;

import java.security.PublicKey;

/**
 * Created by christopherworsley on 9/26/16.
 */
public class Pet {
    protected String typeOfPet;
    protected String petName;
    protected String speak = "Speaking";

public Pet() {}
    public Pet(String petName, String typeOfPet) {
        this.petName = petName;
        this.typeOfPet = typeOfPet;

    }

    public String speak(){
        return speak;
    }

    public Pet determineType(){
        switch (typeOfPet.toLowerCase()){
            case "dog":
                return new Dog(petName);
            case "cat":
                return new Cat(petName);
            case "pig":
                return new Hamster(petName);

            default:

        }

        return null;
    }
    public void setPetName(String name){this.petName = name;}
    public String getPetName(){ return petName;}


    @Override
    public String toString(){
        return String.format("This pet is "+petName+ "and it goes "+speak);
    }


}
