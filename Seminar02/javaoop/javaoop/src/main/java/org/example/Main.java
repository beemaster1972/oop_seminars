package org.example;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("qwe", "asd", 21);
        //па полям
//        cat.name = "Тиша";
//        cat.color = "Black";
//        cat.age = 21;
        //инкапсулировали
        cat.setName("Тиша");
        cat.setColor("Black");
        cat.setAge(31);
        System.out.println("cat = " + cat);
        cat.jump();
        cat.voice();
        cat.animalInfo();
    }

}