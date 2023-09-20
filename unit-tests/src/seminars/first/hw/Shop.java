package seminars.first.hw;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * @return отсортированный по возрастанию и цене список продуктов
     */
    public List<Product> getSortedListProducts() {
        products = products.stream()
                .sorted(Comparator.comparingInt(Product::getCost))
                .collect(Collectors.toList());
        return products;
    }

    /**
     * @return самый дорогой продукт
     */
    public Product getMostExpensiveProduct() {
        return products.stream()
                .max(Comparator.comparingInt(Product::getCost))
                .orElse(null);
    }

}