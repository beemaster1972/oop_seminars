package gb.oop.seminars;

public class LogCalculableFactory implements ICalculableFactory{
    @Override
    public Calculable create(int primaryArg) {
        return new LogCalculator(primaryArg);
    }
}
