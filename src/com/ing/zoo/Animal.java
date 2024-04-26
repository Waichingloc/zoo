/**
 * Abstract class for animals
 * All animals have a name and can say hello
 */
package com.ing.zoo;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sayHello();

}
