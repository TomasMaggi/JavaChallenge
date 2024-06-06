package org.javapoo;

import org.javapoo.Product.Product;
import org.javapoo.Product.ProductContainer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    /**
     * Initialize product container with test products
     * */
    private static ProductContainer init() {
        List<Product> productContainer = new ArrayList<>();

        Map<String, String> p1 = new HashMap<>() {{ put("Litros", "1.5"); }};
        productContainer.add(new Product("Coca-Cola Zero", 20, p1));

        Map<String, String>p2 = new HashMap<>() {{ put("Litros", "1.5"); }};
        productContainer.add(new Product("Coca-Cola", 18, p2));

        Map<String, String>p3 = new HashMap<>() {{ put("Contenido", "500ml"); }};
        productContainer.add(new Product("Shampoo Sedal", 19, p3));

        Map<String, String>p4 = new HashMap<>() {{ put("Unidad de venta", "kilo"); }};
        productContainer.add(new Product("Frutillas", 64, p4));

        return new ProductContainer(productContainer);
    }
    public static void main(String[] args) {
        var p = init();

        System.out.println(p.toString());
    }
}