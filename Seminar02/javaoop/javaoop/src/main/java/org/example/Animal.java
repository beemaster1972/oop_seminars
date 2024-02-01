package org.example;

public class Animal {

    protected String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Имя животного : " + name);
    }

    public void voice() {
        System.out.println("Звук!");
    }

    public void jump() {
        System.out.println(" Прыжок ! ");
    }
}
