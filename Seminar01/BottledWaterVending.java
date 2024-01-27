import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BottledWaterVending extends VendingMachine {
    protected int quantityOfProducts = 20;
    protected String name = "БУТИЛИРОВАННОЙ ВОДЫ";
    protected List<BottledWater> products;

    public BottledWaterVending(){
        this.stateAutomat = State.Off;
        this.products = new ArrayList<>();
        this.amountReceipt = 0.0;
    }
    @Override
    public void initProduct(){
        BottledWater product = new BottledWater();
        for (int i = 0; i < this.quantityOfProducts; i++) {
            this.products.add(product);
            product = new BottledWater();
        }
    }
    
    public static Product getProduct(String name, List<BottledWater> products, double volume){
        for (BottledWater product:products){
            if (product.getName().contains(name) && 
            Double.compare(volume, product.getVolume())==0 && Double.compare(volume, 0) >0){
                return product;
            }
        }
        return null;

    }
    
}
