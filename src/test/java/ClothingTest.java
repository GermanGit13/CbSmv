
import domain.Clothing;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import util.Constants;

import static junit.framework.Assert.assertEquals;

public class ClothingTest {

    private static Clothing clothingA;
    private static Clothing clothingB;


    @BeforeAll
    public static void setup() {
        clothingA = new Clothing ("german", "50979686 W", "G.Rodriguez", 13, "XL", Constants.PRICE);
        clothingB = new Clothing ("german", "50979686 W", "G.Rodriguez", 13, "XL", Constants.PRICE);
    }

    @Test
    public void getName() {
        String name = clothingA.getName();
        assertEquals(clothingB.getName(), name);
    }

    @Test
    public void getDni() {
        String dni = clothingA.getDni();
        assertEquals(clothingB.getDni(), dni);
    }

    @Test
    public void getSerigraphy() {
        String Serigraphy = clothingA.getSerigraphy();
        assertEquals(clothingB.getSerigraphy(), Serigraphy);
    }

    @Test
    public void getNumber() {
        int number = clothingA.getNumber();
        assertEquals(clothingB.getNumber(), number);
    }

    @Test
    public void getSize() {
        String size = clothingA.getSize();
        assertEquals(clothingB.getSize(), size);
    }

    @Test
    public void getPrice() {
        float price = clothingA.getPrice();
        assertEquals(45.50f, price);
    }
}

