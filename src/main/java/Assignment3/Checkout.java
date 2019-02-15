package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class Checkout {
    List<DessertItem> checkout = new ArrayList();
    int numberOfItems() {
        int n;
        return n = checkout.size();
    }
    void add(DessertItem dessertItem) {
        checkout.add(dessertItem);
    }
    double totalCost() {
        double c = 0;
        for (DessertItem dessertItem: checkout) {
            c += dessertItem.calculateItemCost();
        }
        return c;

    }
    String receipt() {
        String r = "Items: ";
        for (DessertItem desertitem:checkout) {
            r += desertitem.name + ", ";
        }
        return r;
    }
    @Override
    public String toString() {
        return receipt();
    }

    public double totalTax() {
        double t = 0;
        for (DessertItem desertitem:checkout) {
            t += desertitem.findSalesTax();
        }
        return t;
    }
}
//sales tax 5%