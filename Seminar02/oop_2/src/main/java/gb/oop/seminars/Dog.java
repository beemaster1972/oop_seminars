package gb.oop.seminars;

public class Dog extends Animal {
    public static int count;
    private String poroda;
    private final int MAX_RUN_DISTANCE = 500;
    private final int MAX_SWIM_DISTANCE = 10;

    public Dog(String name, String poroda) {
        super(name);
        this.poroda = poroda;
        count++;
    }

    @Override
    void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(getName() + " пробежал: " + distance + " метров");
        } else {
            System.out.println(getName() + " НЕ пробежал: " + distance + " метров");
        }
    }

    @Override
    void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE) {
            System.out.println(getName() + " проплыл: " + distance + " метров");
        } else {
            System.out.println(getName() + " НЕ проплыл: " + distance + " метров");
        }
    }
}