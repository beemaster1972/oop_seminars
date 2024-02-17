package gb.oop.seminars;

public class LogCalculator implements Calculable{

    private Logable logger;
    private int primaryArg;
    private Calculable calculator;
    public LogCalculator(int primaryArg) {
        this.primaryArg = primaryArg;
        logger = new ConsoleLogger();
        calculator = new Calculator(primaryArg);
    }

    public LogCalculator(Logable logger, int primaryArg) {
        this.logger = logger;
        this.primaryArg = primaryArg;
        calculator = new Calculator(primaryArg);
    }

    public LogCalculator(Logable logger, int primaryArg, Calculable calculator) {
        this.logger = logger;
        this.primaryArg = primaryArg;
        this.calculator = calculator;
    }

    @Override
    public Calculable sum(int arg) {
        logger.log(String.format("Суммирование c %d", arg));
        return calculator.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logger.log(String.format("Умножение на %d", arg));
        return calculator.multi(arg);
    }

    @Override
    public int getResult() {
        logger.log(String.format("Возвращение результата для начального значения %d", primaryArg));
        return calculator.getResult();
    }
}
