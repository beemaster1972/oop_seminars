/*
6) Создать класс человек с возможностью ездить и останавливаться на: машине,
скейтборде,велосипеде(что будет если расширить список ?).
 */
package gb.oop.seminars;

import java.util.Objects;

public class Human1 extends Animal {
    private final int MAX_RUN_DISTANCE = 42_000;
    private Vehicle curVehicle;
    public static int count;

    public Human1(String name) {
        super(name);
        this.curVehicle = null;
    }

    public void drive(Vehicle vehicle){
        if (Objects.isNull(curVehicle) ) {
            System.out.printf("%s", getName());
            vehicle.drive();
            curVehicle = vehicle;
        } else System.out.printf(" уже едет на %s%n",curVehicle.getName());
    }
    public void stop(Vehicle vehicle){
        System.out.printf("%s", getName());
        if(vehicle.equals(curVehicle)) {
            vehicle.stop();
            curVehicle = null;
            System.out.println();
        } else if (Objects.isNull(curVehicle)) System.out.printf(" ни на чём не едет%n");
        else System.out.printf(" едет на %s", curVehicle.getName());
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

    }
}
