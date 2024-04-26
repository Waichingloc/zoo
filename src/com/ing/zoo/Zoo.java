package com.ing.zoo;

import com.ing.zoo.animals.Trick;
import com.ing.zoo.animals.carnivore.Carnivore;
import com.ing.zoo.animals.carnivore.Lion;
import com.ing.zoo.animals.carnivore.Tiger;
import com.ing.zoo.animals.herbivore.Giraffe;
import com.ing.zoo.animals.herbivore.Herbivore;
import com.ing.zoo.animals.herbivore.Hippo;
import com.ing.zoo.animals.herbivore.Zebra;
import com.ing.zoo.animals.omnivore.Panda;
import com.ing.zoo.animals.omnivore.Pig;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Animal[] animals = new Animal[7];
        animals[0] = new Lion("henk");
        animals[1] = new Hippo("elsa");
        animals[2] = new Pig("dora");
        animals[3] = new Tiger("wally");
        animals[4] = new Zebra("marty");
        animals[5] = new Panda("po");
        animals[6] = new Giraffe("esther");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        if (input.equals(commands[0])){
            for (int i = 0; i < animals.length; i++) {
                animals[i].sayHello();
            }
        }
        else if(input.equals(commands[0] + " henk"))
        {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i].name.equals("henk")) {
                    animals[i].sayHello();
                }
            }
        }
        else if(input.equals(commands[0] + " elsa"))
        {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i].name.equals("elsa")) {
                    animals[i].sayHello();
                }
            }
        }
        else if(input.equals(commands[0] + " dora"))
        {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i].name.equals("dora")) {
                    animals[i].sayHello();
                }
            }
        }
        else if(input.equals(commands[0] + " wally"))
        {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i].name.equals("wally")) {
                    animals[i].sayHello();
                }
            }
        }
        else if(input.equals(commands[0] + " marty"))
        {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i].name.equals("marty")) {
                    animals[i].sayHello();
                }
            }
        }
        else if(input.equals(commands[0] + " po"))
        {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i].name.equals("po")) {
                    animals[i].sayHello();
                }
            }
        }
        else if(input.equals(commands[0] + " esther"))
        {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i].name.equals("esther")) {
                    animals[i].sayHello();
                }
            }
        }
        else if (input.equals(commands[1])){
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] instanceof Herbivore) {
                    ((Herbivore) animals[i]).eatLeaves();
                }
            }
        }
        else if (input.equals(commands[2])){
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] instanceof Carnivore) {
                    ((Carnivore) animals[i]).eatMeat();
                }
            }
        }
        else if (input.equals(commands[3])){
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] instanceof Trick) {
                    ((Trick) animals[i]).performTrick();
                }
            }
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }
}
