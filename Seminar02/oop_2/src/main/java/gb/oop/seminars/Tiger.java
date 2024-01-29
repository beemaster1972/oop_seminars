package gb.oop.seminars;

public class Tiger  extends Cat{
    public static int count;
    private final int MAX_RUN_DISTANCE = 300;


    public Tiger(String name, String color) {
        super(name, color);
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
}
