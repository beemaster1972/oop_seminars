package gb.oop.seminars;

public abstract class Cat extends  Animal{
    public static int count;
    private String color;


    public Cat(String name, String color) {
        super(name);
        this.color = color;
        count++;
    }
    @Override
    void swim(int distance) {
        System.out.println("все коты не умеют плавать!");
    }
}


