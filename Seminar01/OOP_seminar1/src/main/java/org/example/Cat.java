package org.example;

public class Cat {
    private String name;
    private String color;
    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age>20 || age < 0){
            System.out.printf("Invalid age value: %d%n", age);
            return;
        }
        this.age = age;
    }
}
