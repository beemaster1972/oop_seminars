import java.util.List;

public interface InterfaceVendingMachine {
    int quantityOfProducts = 10;
    String name = "";
    void power();
    Object getProducts();
    void showProducts();
    //void powerOn();
    //void powerOff();
    //void removeProduct();
    void sellProduct();
    void encachement();
    Double getAmountReceipt();
    void work();
    Object getProduct();
    void initProduct();
    boolean getState();

    
}
