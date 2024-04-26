/**
 * This class represents a Lion in the zoo.
 * A Lion is a carnivore.
 */
package com.ing.zoo.animals.carnivore;

import com.ing.zoo.Animal;

/**
 * The Lion class extends the Animal class and implements the Carnivore interface.
 */
public class Lion extends Animal implements Carnivore {
    public String name;
    public String helloText;
    public String eatText;

    public Lion(String name)
    {
        super(name);
    }


    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
