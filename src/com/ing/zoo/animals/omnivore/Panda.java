/**
 * This class represents a Panda in the zoo.
 * A Panda is an omnivore and can perform a trick.
 */
package com.ing.zoo.animals.omnivore;

import com.ing.zoo.Animal;
import com.ing.zoo.animals.Trick;
import com.ing.zoo.animals.carnivore.Carnivore;
import com.ing.zoo.animals.herbivore.Herbivore;

import java.util.Random;

/**
 * The Panda class extends the Animal class and implements the Herbivore, Carnivore and Trick interfaces.
 */
public class Panda extends Animal implements Herbivore, Carnivore, Trick {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Panda(String name) {
        super(name);
    }

    public void sayHello()
    {
        helloText = "panda panda";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch bamboo";
        System.out.println(eatText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom thx";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "does a backflip";
        }
        else
        {
            trick = "does a frontflip";
        }
        System.out.println(trick);
    }
}
