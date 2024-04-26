/**
 * This class represents a Hippo in the zoo.
 * A Hippo is a herbivore.
 */
package com.ing.zoo.animals.herbivore;

import com.ing.zoo.Animal;

/**
 * The Hippo class extends the Animal class and implements the Herbivore interface.

 */
public class Hippo extends Animal implements Herbivore{
    public String name;
    public String helloText;
    public String eatText;

    public Hippo(String name) {
        super(name);
    }

    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
