package gb.oop.seminars;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        GenBox<Integer> box1 = new GenBox<>(10);
//        GenBox<Integer> box2 = new GenBox<>(20);
//        GenBox<Double> box3 = new GenBox<>(100.0);
//        int sum = box1.getObj() + box2.getObj();
//        System.out.println(sum);
//        Double sum2 = box3.getObj()+box2.getObj();
//        System.out.println(sum2);
        BoxWithNumbers<Double> doubleBoxWithNumbers = new BoxWithNumbers<>(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0});
        System.out.println(doubleBoxWithNumbers.average());
        BoxWithNumbers<Integer> intList = new BoxWithNumbers<>(new Integer[]{1, 2, 3, 4, 5, 6,7,8});
        System.out.println(intList.average());
        System.out.println(doubleBoxWithNumbers.compareAverage(intList));
        Calculator<Integer> calc = new Calculator<>(new ArrayList<>());
        for (int i = 0; i < 100 ; i++) {
            calc.getNumbers().add(i);

        }
        System.out.println(calc.sum());
    }
}
