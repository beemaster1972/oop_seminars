import java.util.Random;

/**
 * BottledWater
 */
public class BottledWater extends Product{

    protected int price;
    private double volume;

    /**
     * Создание бутылки воды
     */
    public BottledWater(){
        super(String.format("Бутилированная вода № %d", ++BottledWater.defaultIndex));
        Random rand = new Random();
        this.price = rand.nextInt(401);
        this.volume = Math.round(rand.nextDouble()*3*100)/100.0;
    }
    @Override
    public Integer getPrice() {return this.price;}
    public double getVolume(){ return this.volume;}
    public void setPrice(int price) {this.price = price;}

    
}