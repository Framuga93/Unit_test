package seminars.first.hw;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class ShopTest {

    /*
     1. Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)
     2. Проверить, что магазин возвращает верный самый дорого продукт getMostExpensiveProduct
     3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов
    */

    public static void main(String[] args) {
        Shop shop = new Shop();
        List<Product> shopBasket = new ArrayList<>();
        shopBasket.add(new Product(100,"Макароны"));
        shopBasket.add(new Product(50,"Хлеб"));
        shopBasket.add(new Product(200,"Колбаса"));
        shopBasket.add(new Product(250,"Сыр"));


        shop.setProducts(shopBasket);

        assertThat(shop.getProducts()).hasSize(4);

        assertThat(shop.getMostExpensiveProduct().getCost()).isEqualTo(250);

        assertThat(shop.getSortedListProducts().get(0).getCost()).isEqualTo(50);
        assertThat(shop.getSortedListProducts().get(1).getCost()).isEqualTo(100);
        assertThat(shop.getSortedListProducts().get(2).getCost()).isEqualTo(200);
        assertThat(shop.getSortedListProducts().get(3).getCost()).isEqualTo(250);
    }
}




