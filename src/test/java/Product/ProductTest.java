package Product;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.javapoo.Product.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class ProductTest {

    @Test
    @DisplayName("check to string")
    void checkToString() {
        Map<String, String> p1 = new HashMap<>() {{ put("Litros", "1.5"); }};
        var p = new Product("Coca-Cola Zero", 20, p1);

        assertEquals("Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20", p.toString());
    }

    @Test
    @DisplayName("check compare")
    void checkCompareTo() {
        var p1 = new Product("Coca-Cola Zero", 20);
        var p2 = new Product("Coca-Cola", 18);
        
        assertEquals(1, p1.compareTo(p2));
    }
}
