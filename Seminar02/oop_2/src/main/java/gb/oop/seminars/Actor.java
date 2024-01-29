package gb.oop.seminars;

/** Actor */
public abstract class Actor {

  protected String name;
  protected boolean isMakeOrder;
  protected boolean isTakeOrder;

  abstract String getName();

  public boolean isMakeOrder() {
    return isMakeOrder;
  }

  public boolean isTakeOrder() {
    return isTakeOrder;
  }
}
