package Product;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.javapoo.Product.Product;
import org.javapoo.Product.ProductContainer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductContainerTest {

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

    @Test
    @DisplayName("check to string")
    public void checkToString() {
        var p = init();

        String target = """
                Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20                                
                Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18                                
                Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19                                
                Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo                                
                =============================                                
                Producto más caro: Frutillas                                
                Producto más barato: Coca-Cola
                """.trim();

        assertEquals(target, p.toString());
    }
}
