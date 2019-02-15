package Assignment3;

public class Candy extends DessertItem{
    double weight;
    double price;
    Candy(String n, double p, double w){
        super(n);
        this.price=p;
        this.weight=w;
    }
    @Override
    double calculateItemCost(){
        return weight * price;
    }

    @Override
    double findSalesTax() {
        return calculateItemCost()*0.05;
    }
}
