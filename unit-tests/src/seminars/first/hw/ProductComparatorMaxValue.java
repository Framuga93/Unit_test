package seminars.first.hw;

import java.util.Comparator;

public class ProductComparatorMaxValue implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getCost() > o2.getCost())
            return 1;
        else if (o1.getCost() < o2.getCost())
            return -1;
        return 0;
    }
}
