package ch.heigvd.gen2019;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<Product>();
    private int id;

    public Order(int id) {
        this.id = id;
    }
    public void AddProduct(Product product) {
        products.add(product);
    }

    void getContent(StringBuffer sb) {
        sb.append("{\"id\": ");
        sb.append(id);
        sb.append(", \"products\": [");

        for (Product product: products) {
            product.getProductContent(sb);
        }

        if (products.size() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("]}, ");
    }
}
