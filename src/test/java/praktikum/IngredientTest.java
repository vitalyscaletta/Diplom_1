package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class IngredientTest {

    private final IngredientType type;
    private final String name;
    private final float price;
    private Ingredient ingredient;

    public IngredientTest(IngredientType type, String name, float price) {
        this.type = type;
        this.price = price;
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {IngredientType.SAUCE, "hot sauce", 100},
                {IngredientType.SAUCE, "sour cream", 200},
                {IngredientType.FILLING, "cutlet", 100},
                {IngredientType.FILLING, "dinosaur", 300}
        };
    }

    @Before
    public void setUp() {
        ingredient = new Ingredient(type, name, price);
    }

    @Test
    public void testGetPrice() {
        assertEquals("Цена ингредиента не соответствует ожидаемому", price, ingredient.getPrice(), 0.01f);
    }

    @Test
    public void testGetName() {
        assertEquals("Название ингредиента не соответствует ожидаемому", name, ingredient.getName());
    }

    @Test
    public void testGetType() {
        assertEquals("Тип ингредиента не соответствует ожидаемому", type, ingredient.getType());
    }
}