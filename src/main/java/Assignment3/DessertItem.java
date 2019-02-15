package Assignment3;

public abstract class DessertItem {
    //List<DI> = Checkout = new ArrayList();
    String name;
    double calculateItemCost() {
        return 0;
    }
    DessertItem(String n) {
        this.name = n;
    }
    abstract double findSalesTax();
}
