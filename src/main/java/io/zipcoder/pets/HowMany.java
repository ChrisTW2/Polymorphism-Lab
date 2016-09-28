package io.zipcoder.pets;

import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by christopherworsley on 9/26/16.
 */
public class HowMany {
    private int howManyPets;
    private List<Pet> petList = new ArrayList();
    private String typeOfPet;
    private String nameOfPet;

    public void ask() {

        Scanner ask = new Scanner(System.in);
        System.out.println("How many Pets do you have?");

        howManyPets = ask.nextInt();
        for (int i = 1; i <= howManyPets; i++) {
            System.out.println("What type of of animal is your pet? ");

            typeOfPet = ask.next();

            System.out.println("What is your pets name?");

            nameOfPet = ask.next();
            addPet();
        }

        printContents();
    }






    public void addPet() {
        petList.add(new Pet(nameOfPet, typeOfPet));
    }
    public void printContents(){
        for (Pet p:petList) {
            Pet b = p.determineType();
            System.out.println(b.toString());
        }

    }
    public static void main(String[] args) {
        HowMany p = new HowMany();

        p.ask();
    }


}
