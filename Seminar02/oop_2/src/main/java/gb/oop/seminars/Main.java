package gb.oop.seminars;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Actor human = new Human();
//        System.out.println(human);
//        Cat hCat = new HomeCat("barsik", "white");
        Human1 man = new Human1("John");
        Car tazik = new Car("Taz-2110");
        man.drive(tazik);
        man.stop(tazik);
        Vehicle velik = new Bicycle("ural");
        Vehicle skate = new Skate("Doska");
        man.drive(velik);
//        man.stop(velik);
        man.drive(skate);
        man.stop(skate);
    }
}
