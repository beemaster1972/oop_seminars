/*
3)	Написать класс калькулятор, принимающий List целочисленных значений,
возвращающий сумму элементов коллекции (метод sum)
 */
package gb.oop.seminars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Calculator<N extends Number> {
//    public Calculator(List<N> numbers) {
//        this.numbers = numbers;
//    }

    private List<N> numbers;

    public Double sum() {
        return numbers.stream().mapToDouble(Number::doubleValue).sum();
    }
}

