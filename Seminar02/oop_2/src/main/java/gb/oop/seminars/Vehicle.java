package gb.oop.seminars;

public abstract class Vehicle {
    String name;

    public Vehicle(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    abstract void drive();
    abstract int getSpeed();
    abstract  void stop();
}
