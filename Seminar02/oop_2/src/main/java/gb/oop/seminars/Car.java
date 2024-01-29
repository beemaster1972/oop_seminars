package gb.oop.seminars;

public class Car extends Vehicle{
    public Car(String name) {
        super(name);
    }

    @Override
    void drive() {
        System.out.printf(" поехал на машине %s со скоростью %d", name, getSpeed());

    }

    @Override
    int getSpeed() {
        return 90;
    }

    @Override
    void stop() {
        System.out.printf(" остановился на машине %s", name);
    }
}
