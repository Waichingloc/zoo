/**
 * Class that represents a Giraffe in the zoo.
 * A Giraffe is a herbivore and can perform a trick.
 */
package com.ing.zoo.animals.herbivore;

import com.ing.zoo.Animal;
import com.ing.zoo.animals.Trick;

import java.util.Random;

/**
 * The Giraffe class extends the Animal class and implements the Herbivore and Trick interfaces.
 */
public class Giraffe extends Animal implements Herbivore, Trick {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Giraffe(String name) {
        super(name);
    }

    public void sayHello()
    {
        helloText = "hhhmmmm hhmmmm";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch leaves";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "does a handstand";
        }
        else
        {
            trick = "runs around in circles";
        }
        System.out.println(trick);
    }
}
