import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * VendingMachine
 */
public class VendingMachine implements InterfaceVendingMachine {
    // Константа - количество товаров в автомате
    protected int quantityOfProducts = 10;
    protected String name = "ТОВАРОВ";

    enum State {
        On, Off
    }

    protected List<Product> products;
    protected State stateAutomat;
    protected double amountReceipt;

    public VendingMachine() {
        this.stateAutomat = State.Off;
        this.products = new ArrayList<>();
        this.amountReceipt = 0.0;
    }

    public void power() {
        if (stateAutomat == State.On)
            powerOff();
        else
            powerOn();

    }

    public List<Product> getProducts() {
        return products;
    }

    public void showProducts() {
        System.out.println("Товары находящиеся в автомате:");
        for (Product product : products) {
            System.out.println(product);

        }
    }

    private void powerOn() {
        stateAutomat = State.On;
        startBIOS();
        startOS();
        System.out.println("Loading products...");
        this.initProduct();
    }

    private void powerOff() {
        System.out.println("Unloading products...");
        this.products = new ArrayList<>();
        stopOS();
        stopBIOS();
        System.out.println("Trade automat is off!");
        stateAutomat = State.Off;
    }

    private void startBIOS() {
        System.out.println("Starting BIOS...");
    }

    private void startOS() {
        System.out.println("Starting OS...");
    }

    private void stopOS() {
        System.out.println("Stopping OS...");
    }

    private void stopBIOS() {
        System.out.println("Stopping BIOS");
    }

    private void removeProduct(Product product) {
        if (products.contains(product)) {
            int indexOf = products.indexOf(product);
            System.out.printf("Продаю %s за %.2f руб.%n", product.getName(), product.getPrice());
            // amountReceipt += product.getPrice();
            products.remove(indexOf);
        }
    }

    public void sellProduct() {
        if (stateAutomat == State.Off)
            return;
        if (products.size() == 0) {
            System.out.println("Автомат пуст. Выключите/включите его для пополнения запасов товаров");
            return;
        }
        showProducts();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите полностью или часть наименования товара: ");
        String productName = scanner.nextLine();
        Product product = getProduct(productName, products);
        if (product != null) {
            System.out.printf("Внесите не меньше %.2f рублей: ", product.getPrice());
            double cache = scanner.nextDouble();
            scanner.close();
            int result = Double.compare(cache, product.getPrice());
            // System.out.printf("Результат сравнения кэша с ценой %d%n", result);
            if (result < 0) {
                System.out.printf(
                        "Вы внесли %.2f меньше стоимости %s равной %.2f. Эти деньги пойдут детям Пармы. Адью.%n", cache,
                        product.getName(), product.getPrice());
                this.amountReceipt += cache;
                return;
            } else {
                System.out.printf("Получите свой товар: %s%n", product);
                removeProduct(product);
                double change = cache - product.getPrice();
                result = Double.compare(change, getAmountReceipt());
                // System.out.printf("Результат сравнения сдачи с выручкой %d", result);
                if (change <= this.amountReceipt) {
                    System.out.printf("Получите сдачу %.2f рублей%n", change);
                    this.amountReceipt += product.getPrice();
                } else if (result > 0) {
                    System.out.println("Соррян, в автомате нет столько налика на сдачу.%n");
                    this.amountReceipt += cache;

                }
            }

        }
    }

    public void encachment(double cacheCollection) {
        if (stateAutomat == State.Off)
            return;
        if (cacheCollection == 0.0) {
            System.out.println("Шутки будете шутить в другом месте");
            return;
        }
        if (Double.compare(cacheCollection, this.amountReceipt - 1.0) < 0) {
            amountReceipt -= cacheCollection;
        } else
            System.out.println("Инкассация невозможна.Нужно оставить хотя бы 1 рубль.");
    }

    public Double getAmountReceipt() {
        if (stateAutomat == State.Off) {
            return null;

        }
        return Math.round(this.amountReceipt * 100) / 100.0;
    }

    public boolean getState() {
        return stateAutomat == State.On;
    }
    @Override
    public void initProduct() {
        Product product = new Product();
        Random rand = new Random();
        for (int i = 0; i < quantityOfProducts; i++) {
            product = new Product();
            product.setPrice(rand.nextDouble() * rand.nextInt(1001));
            this.products.add(product);
        }
    }

    public static Product getProduct(String name, List<Product> products) {
        for (Product product : products) {
            if (product.getName().contains(name)) {
                return product;
            }
        }
        return null;

    }

    public void work() {

        Scanner scanner = new Scanner(System.in);
        int answer = -999;
        double cache = 0.0;
        String stateString = "";
        String propmt = "Автомат по продаже %s (%s)%n" +
                "Доступные команды:%n" +
                "1. Нажать кнопку питания торгового автомата%n" +
                "2. Купить товар в автомате%n" +
                "3. Посмотреть выручку автомата%n" +
                "4. Инкассация автомата%n" +
                "0. Завершить%n" +
                "Введите команду: ";
        while (answer != 0) {
            stateString = getState() ? "Вкл" : "Выкл";
            System.out.println("==========================================");
            System.out.printf(propmt, this.name, stateString);
            answer = scanner.nextInt();
            System.out.println("==========================================");
            switch (answer) {
                case 1:
                    power();
                    break;
                case 2:
                    if (getState()) {
                        sellProduct();
                    } else
                        System.out.println("Сначала включите автомат.");
                    break;
                case 3:
                    if (getAmountReceipt() == null) {
                        System.out.println("Сначала надо включить автомат");
                        break;
                    }
                    System.out.printf("На текущий момент в автомате %.2f рублей%n", getAmountReceipt());
                    break;
                case 4:
                    if (getAmountReceipt() == null) {
                        System.out.println("Сначала надо включить автомат");
                        break;
                    }
                    System.out.print("Введите сумму инкассации: ");
                    cache = scanner.nextDouble();
                    encachment(cache);
                    break;
                case 0:
                    System.out.println("Было приятно почистить ваши карманы");
                    scanner.close();
                    break;
                default:
                    System.out.println("Неизвестная команда");
                    break;
            }
        }
    }
}