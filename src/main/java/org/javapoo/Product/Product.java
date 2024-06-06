package org.javapoo.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Product implements Comparable<Product>{
    private String name;
    private long price;
    private Map<String, String> customAttributes;

    public Product(String name, long price) {
        this.name = name;
        this.price = price;
        this.customAttributes = null;
    }
    public Product(String name, long price, Map<String, String> customAttributes) {
        this.name = name;
        this.price = price;
        this.customAttributes = customAttributes;
    }

    @Override
    public String toString() {
        this.getCustomAttributes().put("Precio", "$" + this.price);
        String out = "";

        out = out.concat("Nombre: " + this.getName());

        List<String> sortedKeys = new ArrayList<>(this.customAttributes.keySet());
        sortedKeys = sortedKeys.stream().sorted().toList();

        for (String k:sortedKeys) {
            out = out.concat(" /// " + k + ": " + this.getCustomAttributes().get(k));
        }

        return out;
    }
    @Override
    public int compareTo(Product product) {
        if (this.price > product.getPrice()) {
            return 1;
        }

        if (this.price < product.getPrice()) {
            return -1;
        }

        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Map<String, String> getCustomAttributes() {
        return customAttributes;
    }

    public void setCustomAttributes(Map<String, String> customAttributes) {
        this.customAttributes = customAttributes;
    }
}
