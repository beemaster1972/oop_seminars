/**
 * Product
 */
public class Product extends AbstractProduct{

    protected String name;
    protected double price;
    protected String describe;
    protected static int defaultIndex;
    static {defaultIndex = 0;}

    public Product(String name, double price, String describe){
        if (name.isEmpty()) name = String.format("Товар_%d", defaultIndex++);
        if (describe.isEmpty()) describe = "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ad, cumque!";
        this.name = name;
        this.price = price;
        this.describe = describe;
    }
    public Product(String name){
        this(name,0.0,"");
        
    }
    public Product(){
        this("",0.0,"");
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    @Override
    public Double getPrice(){ return Math.round(price*100)/100.0;}
    public void setPrice(double price) {this.price = price;}
    public String getDescribe() {return describe;}
    public void setDescribe(String describe) {this.describe = describe;}
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Товар: %s, цена: %2$,.2f, Описание: %3$s", name,price,describe);
    }
}
