/**
 * This class represents a Zebra in the zoo.
 * A Zebra is a herbivore and can perform a trick.
 */

package com.ing.zoo.animals.herbivore;

import com.ing.zoo.Animal;
import com.ing.zoo.animals.Trick;

import java.util.Random;

/**
 * The Zebra class extends the Animal class and implements the Herbivore and Trick interfaces.
 */
public class Zebra extends Animal implements Herbivore {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra(String name) {
        super(name);
    }

    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }

}
