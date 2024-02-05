/*
2)	Создать коробку с числами (BoxWithNumber) и найти среднее значение(average)
и сравнение средних(compareAverage).
 */
package gb.oop.seminars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BoxWithNumbers<N extends Number> {
    private N[] list;

    public double average() {
        double sum = 0;
        for (N n : list) {
            sum += n.doubleValue();

        }
        return (double) sum / list.length;

    }
    public int compareAverage(BoxWithNumbers<? extends Number> other){
        return Double.compare(this.average(), other.average());

    }
}

