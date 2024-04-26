/**
 * This class represents a Tiger in the zoo.
 * A Tiger is a carnivore and can perform a trick.
 */
package com.ing.zoo.animals.carnivore;

import com.ing.zoo.Animal;
import com.ing.zoo.animals.Trick;

import java.util.Random;

/**
 * The Tiger class extends the Animal class and implements the Carnivore and Trick interfaces.
 */
public class Tiger extends Animal implements Carnivore, Trick {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Tiger(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        helloText = "rraaarww";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
