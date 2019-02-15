package Assignment3;

public class Sundae extends IceCream {
    String topping;
    double tPrice;
    double price;
    Sundae(String n, double p, String topping, double tPrice){
        super(n,p);
        this.topping=topping;
        this.price=p;
        this.tPrice=tPrice;
    }

    @Override
    double calculateItemCost() {
        return price + tPrice;
    }
}
