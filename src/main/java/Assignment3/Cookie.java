package Assignment3;

public class Cookie extends DessertItem {
    Cookie(String n, int q, double p){
        super(n);
        this.quantity=q;
        this.price=p;
    }
    int quantity;
    double price;
    @Override
    double calculateItemCost() {
        return price*quantity;
    }

    @Override
    double findSalesTax() {
        return calculateItemCost()*0.05;
    }
}
