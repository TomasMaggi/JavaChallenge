package org.javapoo.Product;

import java.util.*;

public class ProductContainer {
    List<Product> productContainer;

    public ProductContainer(List<Product> p) {
        this.productContainer = p;
    }

    @Override
    public String toString() {
        String out = "";

        for (Product p:productContainer) {
            out += p.toString() + "\n";
        }

        Product[] arr = productContainer.toArray(new Product[0]);
        Arrays.sort(arr);

        out += "=============================" + "\n";

        out += "Producto más caro: " + arr[arr.length - 1].getName() + "\n";
        out += "Producto más barato: " + arr[0].getName();

        return out;
    }
}
