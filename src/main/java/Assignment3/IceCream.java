package Assignment3;

public class IceCream extends DessertItem {
    IceCream(String n, double p){
        super(n);
        this.price = p;
    }
    double price;
    @Override
    double calculateItemCost() {
        return price;
    }

    @Override
    double findSalesTax() {
        return calculateItemCost()*0.05;
    }
}
