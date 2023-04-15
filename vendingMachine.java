import java.util.List;
import java.util.Objects;

public class vendingMachine {
    private final List<Product> products;

    public vendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name, int volume) {
        for (Product product : products) {
            if (product instanceof BottleofWater) {
                if (Objects.equals(product.getName(), name) && ((BottleofWater) product).getVolume() == volume) {
                    return product;
                }
            }

        }
        return null;
    }

}
