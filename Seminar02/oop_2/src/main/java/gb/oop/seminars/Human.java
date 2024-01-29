package gb.oop.seminars;

/** Human */
public class Human extends Actor implements ActorBehaviuor{

    private static int defaultIndex;
    static {
        defaultIndex =0;
    }
    public Human(String name) {
        this.name = name;
    }

    public Human(){
        this(setDefaultName());
    }

    private static String setDefaultName() {
        return String.format("Human #%d",++defaultIndex);
    }

    protected String getName() {
    return name;
  }
  @Override
  public void setTakeOrder(){
      isTakeOrder = ! isTakeOrder;
  }

    @Override
    public void setMakerOrder() {
        isMakeOrder = ! isMakeOrder;
    }

    @Override
    public String toString() {
        return "Human{" +
                "Имя='" + name + '\'' +
                ", Сделал заказ=" + isMakeOrder +
                ", Получил заказ=" + isTakeOrder +
                '}';
    }
}
